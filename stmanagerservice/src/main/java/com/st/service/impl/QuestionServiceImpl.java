package com.st.service.impl;

import com.st.common.pojo.StResult;
import com.st.mapper.QuestionInfoMapper;

import com.st.mapper.UserInfoMapper;
import com.st.pojo.*;
import com.st.service.QuestionService;
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


}
