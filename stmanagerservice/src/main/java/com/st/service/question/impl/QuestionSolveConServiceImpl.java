package com.st.service.question.impl;

import com.st.common.pojo.StResult;
import com.st.mapper.QuestionSolveConMapper;
import com.st.pojo.QuestionSolveCon;
import com.st.service.question.QuestionSolveConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */

@Service("qsc")
public class QuestionSolveConServiceImpl implements QuestionSolveConService {

    @Autowired
    private QuestionSolveConMapper questionSolveConMapper;

    /**
     *
     * @param id
     * @return
     */
    @Override
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
           QuestionSolveCon qsc= questionSolveConMapper.getSolveByid(id);
           map.put("data",qsc);
           return map;
        }
        return null;
    }
}
