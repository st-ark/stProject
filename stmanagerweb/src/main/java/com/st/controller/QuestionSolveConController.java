package com.st.controller;

import com.st.common.pojo.StResult;
import com.st.service.question.QuestionSolveConService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */
@Controller
@RequestMapping("/qsc")
public class QuestionSolveConController {

    @Autowired
    private QuestionSolveConService questionSolveConService;

    /**
     *
     * @param id
     * @return
     * 根据 id 查询 一个 解题思路 的所有信息
     */

    @ResponseBody
    @RequestMapping(value = "/getSolveByid/{id}",method = RequestMethod.POST)
    public Map<String,Object> getSolveByid (@PathVariable String id)
    {
        HashMap<String,Object> map=new HashMap<>();
        if(id==null || "".equals("id"))
        {
            StResult result =new StResult("请求失败");
            map.put("status",result);
            return map;
        }
        else{
            Map<String,Object> data=questionSolveConService.getSolveByid(id);
            map.put("data",data);
            map.put("status","请求成功");
            return map;
        }
    }

}
