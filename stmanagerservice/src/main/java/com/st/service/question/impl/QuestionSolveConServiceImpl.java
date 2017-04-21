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
                System.out.print("异常为。。。。。。。===》"+e);
                StResult.ok(e);
            }
        }
        return 0;
    }
}
