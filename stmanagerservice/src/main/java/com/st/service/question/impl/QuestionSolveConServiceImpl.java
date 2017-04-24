package com.st.service.question.impl;

import com.st.common.params.QuestionSolve;
import com.st.common.params.QuestionSolveCon;
import com.st.common.pojo.StResult;
import com.st.common.utils.IDUtils;
import com.st.mapper.QuestionSolveConMapper;
import com.st.mapper.QuestionSolveMapper;
import com.st.mapper.UserInfoMapper;

import com.st.pojo.UserInfo;
import com.st.service.question.QuestionSolveConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */

@Service("qsc")
public class QuestionSolveConServiceImpl implements QuestionSolveConService {

    @Autowired
    private QuestionSolveConMapper questionSolveConMapper;

    @Autowired
    private QuestionSolveMapper questionSolveMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value="/getSolveByid",method = RequestMethod.POST)
    public Map<String, Object> getSolveByid(String id) {
        HashMap<String,Object> map=new HashMap<>();
        if(id=="" || "".equals("id"))
        {
            StResult result= new StResult("思路id不能为空");
            map.put("status",result);
            return map;
        }
        if(id!="" || !"".equals("id"))
        {
          com.st.pojo.QuestionSolveCon qsc= questionSolveConMapper.getSolveByid(id);
           map.put("data",qsc);
           return map;
        }
        return null;
    }

    @Override
    public int addQuestionSolve(QuestionSolve qs, List<QuestionSolveCon>list) {
        if(qs==null || "".equals(qs))
        {
            StResult.ok("传入参数不能为空");
        }
        else{
            //判断是否为考霸
            try{
                UserInfo ui=userInfoMapper.checkAuhority(qs.getUpId());
                if(ui.getType()!=1)
                {
                    throw new RuntimeException("您不是考霸，没有该操作权限");

                }else{
                    QuestionSolve q=new QuestionSolve();
                    q.setContent(qs.getContent());
                    q.setQuestionId(qs.getQuestionId());
                    q.setSolveId(IDUtils.createId());
                    q.setUpId(qs.getUpId());
                    int count=questionSolveMapper.addQuestionSolve(q);
                    if(count>0)
                    {
                        //添加错法
                        //判断是否有选项
                       if(list != null && list.size() > 0)
                       {
                           List<QuestionSolveCon> qlist=list;
                           for(QuestionSolveCon c:qlist)
                           {
                               QuestionSolveCon qn=new QuestionSolveCon();
                               qn.setEyeCheck(c.getEyeCheck());
                               qn.setEyeId(c.getEyeId());
                               qn.setFormulaCheck(c.getFormulaCheck());
                               qn.setKnowledgeCheck(c.getKnowledgeCheck());
                               qn.setKnowledgeId(c.getKnowledgeId());
                               qn.setQuestionId(q.getQuestionId());
                               qn.setFormulaId(c.getFormulaId());
                               qn.setSolveId(q.getSolveId());
                               qn.setTrapCheck(c.getTrapCheck());
                               qn.setTrapId(c.getTrapId());
                               int count1=questionSolveConMapper.addQuestionSolveCon(qn);
                               if(count1>0)
                               {
                                   StResult.ok("添加错法成功");
                               }
                           }
                       }
                        return count;
                    }
                }
            }catch (Exception e){

                StResult.ok(e);
            }
        }
        return 0;
    }

    @Override
    public int updateQuestionSolve(QuestionSolve qs, List<QuestionSolveCon> list) {

        if(qs==null || "".equals(qs))
        {
            StResult.ok("传入参数不能为空");
        }
        else{
            //判断是否为考霸且是否为上传人
                UserInfo ui=userInfoMapper.checkAuhority(qs.getUpId());
                int num=questionSolveMapper.queryBySolveId(qs.getUpId(),qs.getSolveId());
                if(ui.getType()!=1 )
                {
                    throw new RuntimeException("您不是考霸，没有该操作权限");

                }
                if(num<0)
                {
                    throw new RuntimeException("您不是上传者，没有操作权限");
                }
                else
                    {
                      int count=  questionSolveMapper.updateSolve(qs);
                      if(count>0)
                      {
                          //判断是否有错法
                          if(list!=null && list.size()>0)
                          {
                                for(QuestionSolveCon s:list)
                                {
                                    QuestionSolveCon c=new QuestionSolveCon();
                                    c.setSolveId(qs.getSolveId());
                                    c.setQuestionId(qs.getQuestionId());
                                    c.setKnowledgeId(s.getKnowledgeId());
                                    c.setKnowledgeCheck(s.getKnowledgeCheck());
                                    c.setTrapId(s.getTrapId());
                                    c.setTrapCheck(s.getTrapCheck());
                                    c.setFormulaId(s.getFormulaId());
                                    c.setFormulaCheck(s.getFormulaCheck());
                                    c.setEyeId(s.getEyeId());
                                    c.setEyeIdOld(s.getEyeIdOld());
                                    c.setEyeCheck(s.getEyeCheck());
                                    System.out.print("TESTResult"+c.getEyeId()+"------------->"+c.getEyeIdOld());
                                    int count1=questionSolveConMapper.updateQuestionSolveCon(c);
                                    if(count1>0)
                                    {
                                        StResult.ok("修改成功");
                                    }
                                    if(s.getEyeId()!=s.getEyeIdOld())//若eyeId相同则修改，eyeId不同则修改并删除原来的eyeOldId
                                    {
                                        //删除原来的eyeId
                                        int count3=questionSolveConMapper.delEyeById(s.getEyeIdOld());
                                        if(count3>0)
                                        {
                                            StResult.ok("删除eyeId成功");
                                        }
                                    }


                                }
                          }
                          return count;
                      }

                    }
        }
        return 0;
    }

    /**
     * 根据思路id删除解题思路
     * @param solveId
     * @return
     */
    @Override
    public int delQuestionSolve(String solveId,String upId) {
        if(solveId==null || "".equals("solveId"))
        {
            StResult.ok("solveId不能为空");
        }
        else{
            //判断该用户是否有权限
            int count=questionSolveConMapper.queryUserById(upId,solveId);
            if(count<0)
            {
                StResult.ok("您没有操作权限"); 
            }
            else{
                int count1=questionSolveConMapper.delQoestionSolveById(solveId);
                if(count>0)
                {
                    return count1;
                }
            }
        }
        return 0;
    }
}
