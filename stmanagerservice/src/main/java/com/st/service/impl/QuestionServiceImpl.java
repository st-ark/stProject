package com.st.service.impl;

import com.st.common.pojo.StResult;
import com.st.mapper.QuestionInfoMapper;

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



}
