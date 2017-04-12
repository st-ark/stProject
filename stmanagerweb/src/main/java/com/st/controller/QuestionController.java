package com.st.controller;

import com.st.pojo.QuestionInfo;
import com.st.service.QuestionService;
import com.st.common.pojo.StResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 题目加载Controller
 * Created by pengzijun on 8/4/2017.
 */
@Controller
@RequestMapping("/qi")
public class QuestionController {
    @Autowired
    private QuestionService questionService;


    @ResponseBody
    @RequestMapping(value="/question/{id}",method = RequestMethod.GET)
    public Map<String,Object> getQuestionById(@PathVariable String id){
        HashMap<String,Object> map=new HashMap<>();
        if(id==null || "".equals("id"))
        {
            StResult result =new StResult("请求失败");
            map.put("status",result);
            return map;

        }

         else{
            Map<String,Object> data=questionService.getQuestionById(id);
            map.put("data",data);
            return map;
        }
    }

}
