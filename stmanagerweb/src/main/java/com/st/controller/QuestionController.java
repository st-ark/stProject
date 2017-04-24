package com.st.controller;

import com.alibaba.fastjson.JSON;
import com.st.common.params.QuestionChoice;
import com.st.common.params.QuestionParams;
import com.st.common.pojo.StResult;
import com.st.service.question.QuestionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目加载Controller
 * Created by pengzijun on 8/4/2017.
 */
@Controller
@RequestMapping("/qi")
public class QuestionController {

    private static Logger logger = Logger.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;


    /**
     * 根据题目id查询题目所有信息
     * @param id
     * @return
     */
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
            map.put("status","请求成功");
            map.put("data",data);
            return map;
        }
    }

    /**
     *
     * @param qId 题目id
     * @param uId 用户Id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delQuestion/{qId}&{uId}",method = RequestMethod.GET)
    public Map<String,Object> delQuestion(@PathVariable String qId,@PathVariable String uId) {
        HashMap<String,Object> map=new HashMap<>();
        int count = questionService.delQuestion(qId, uId);
            if (count > 0)
            {
                map.put("status","删除成功");
                return map;
            }
            else{
                map.put("status","删除失败");
                return map;
            }

    }
    /**
     *
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/addQuestion",method = RequestMethod.POST)
    public StResult addQuestion (String params, String choice) {
        logger.info(params);
        try {
            if (params == null || "".equals(params)) {
                return StResult.ok("传入参数有误");
            }
            if (params != null && !"".equals(params))
            {
                QuestionParams qp = JSON.parseObject(params, QuestionParams.class);
                List<QuestionChoice> qclist = JSON.parseArray(choice, QuestionChoice.class);
                int count = questionService.addQuestion(qp, qclist);
                if (count > 0)
                {
                    return StResult.ok("添加成功");

                }
            }
            return StResult.ok("添加失败");
        } catch (Exception e) {

            return StResult.ok(e);
        }
    }

    /**
     * 编辑题目
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateQuestion",method = RequestMethod.POST)
    public StResult updateQuestion (String params,String choice)
   {

       if(params==null || "".equals(params))
       {
           StResult.ok("传入参数有误");
       }
       if(params!=null || !"".equals(params))
       {
           QuestionParams qp=JSON.parseObject(params,QuestionParams.class);
           List<QuestionChoice> list=JSON.parseArray(choice,QuestionChoice.class);
           int count=questionService.updateQuestion(qp,list);
           if(count>0)
           {
               StResult.ok("修改成功");
           }
       }



       return null;
   }

} 
