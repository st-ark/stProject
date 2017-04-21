package com.st.service.question.impl;

import com.st.common.params.QuestionChoice;
import com.st.common.params.QuestionParams;
import com.st.common.pojo.StResult;
import com.st.common.utils.IDUtils;
import com.st.mapper.QuestionChoiceConMapper;
import com.st.mapper.QuestionChoiceMapper;
import com.st.mapper.UserInfoMapper;
import com.st.mapper.QuestionInfoMapper;
import com.st.pojo.QuestionInfo;
import com.st.pojo.UserInfo;
import com.st.service.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目加载Service
 * Created by pengzijun on 8/4/2017.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionInfoMapper questionInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private QuestionChoiceMapper questionChoiceMapper;

    @Autowired
    private QuestionChoiceConMapper questionChoiceConMapper;

    /**
     *
     * @param id
     * @return
     */

    @Override
    public Map<String,Object> getQuestionById(String id) {
        HashMap<String,Object> map=new HashMap<>();
        if((id==null && "".equals("id")))
        {
            StResult result= new StResult("解题题目id不能为空");
            map.put("status",result);
            return map;
        }
        if((id!=null && !"".equals("id")))
        {
           QuestionInfo qi= questionInfoMapper.getQuestionByid(id);
            if(qi==null || "".equals(qi))
            {
                StResult result= new StResult("没有解题思路");
                map.put("status",result);

            }
           if(qi!=null && !"".equals(qi))
           {
              if(qi.getType()==0)//根据题目id查询判断题型，为选择题则查询选项
              {
                  QuestionInfo q=questionInfoMapper.queryChoiceByQId(id);
                  map.put("QuestionChoice",q);
              }
               map.put("data",qi);
               return map;
           }
        }
        return null;

    }

    /**
     *
     * @param qId 试卷id
     * @param uId 用户id
     * @return int 受影响行数
     */
    @Override
    public int delQuestion(String qId, String uId) {
        if((qId==null || "".equals("qId")))
        {
            throw new RuntimeException("题目id不能为空");
        }
        if((uId==null || "".equals("uId")))
        {
            throw new RuntimeException("用户id不能为空");
        }
        if((qId!=null && !"".equals("qId")) && (uId!=null && !"".equals("uId")))
        {
            UserInfo ui=userInfoMapper.checkAuhority(uId);
            if(ui!=null && !"".equals(ui))
            {
                //判断是否是该用户上传的
                QuestionInfo qi=questionInfoMapper.queryById(qId,uId);
                if(qi==null ||"".equals(qi))
                {
                    StResult.ok("你没有删除权限");
                }
                else{
                    if(ui.getType()==1)//若为考霸则将状态改为待删除状态
                    {
                        int count=questionInfoMapper.delQuestion(qId,-2);
                        return count;
                    }
                }
            }
        }
        return 0;
    }
    /**
     * 添加题目
     * @param params list
     * @return
     */
    @Override
    public int addQuestion(QuestionParams params, List list) {
        if (params != null && !"".equals(params))
         {
            QuestionParams qp = new QuestionParams();
            qp.setQuestionId(IDUtils.createId());
            qp.setUrl(params.getUrl());
            qp.setUpId(params.getUpId());
            qp.setContent(params.getContent());
            qp.setFromId(params.getFromId());
            qp.setType(params.getType());
            //判断是否为考霸
            UserInfo ui= userInfoMapper.checkAuhority(qp.getUpId());
             if(ui.getType()!=1)
             {
                 StResult.ok("您不是考霸，没有该操作权限");
             }else{
                 //添加题目
                 int count = questionInfoMapper.addQuestion(qp);
                 if (count > 0) {
                     if (list != null && list.size() > 0)//判断是否有选项
                     {
                         List<QuestionChoice> qclist = list;
                         for (QuestionChoice qc : qclist)
                         {
                             QuestionChoice c = new QuestionChoice();
                             c.setChoiceId(IDUtils.createId());
                             c.setContent(qc.getContent());
                             c.setType(qc.getType());
                             c.setUrl(qc.getUrl());
                             //添加选项
                             int count1 = questionChoiceMapper.addChoice(c);
                             if (count1 > 0)
                             {
                                 //添加关联表
                                 int count2 = questionChoiceConMapper.addquestionChoiceCon(qp.getQuestionId(),c.getChoiceId());
                                 if (count2 > 0)
                                 {
                                     StResult.ok("添加成功");
                                 }
                                 StResult.ok("添加成功");
                             }
                         }
                         return count;
                     }
                 }
                 return 0;
             }
        }
        return 0;
    }

    @Override
    public int updateQuestion(QuestionParams params,List list) {

        System.out.print(params.getUpId()+"====================="+params.getQuestionId());
        //判断该用户有没有修改权限
        int count=questionInfoMapper.queryByUserId(params.getUpId(),params.getQuestionId());
        if(count<=0)
        {
            StResult.ok("你没有修改权限");
        }
        else{
           int count1= questionInfoMapper.updateQuestion(params);
           if(count1>0)
           {
               if(list!=null && list.size()>0)//判断是否有选项
               {
                   List<QuestionChoice> qclist=list;
                     //修改选项
                   for(QuestionChoice qc:qclist)
                   {
                       QuestionChoice c = new QuestionChoice();
                       c.setChoiceId(IDUtils.createId());
                       c.setContent(qc.getContent());
                       c.setType(qc.getType());
                       c.setUrl(qc.getUrl());
                       int count2=questionChoiceMapper.updateQuestionChoice(qc);
                       if(count2>0)
                       {
                           StResult.ok("修改成功");
                       }

                   }
               }
               StResult.ok("修改成功");
               return count1;
           }
        }

        return 0;
    }
}