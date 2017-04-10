package com.st.controller;

import com.st.pojo.QuestionInfo;
import com.st.service.QuestionService;
import com.st.common.pojo.StResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 题目加载Controller
 * Created by pengzijun on 8/4/2017.
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;


    @RequestMapping("/question/{questionId}&{type}")
    @ResponseBody
    public StResult getQuestionById(@PathVariable String questionId, @PathVariable int type){
        if (type != 0){
            return new StResult("该题为错题");
        }
        QuestionInfo questionInfo = questionService.getQuestionById(questionId,type);
        if (questionInfo.getState() !=1){
            return new StResult("该题未发布");
        }
        return new StResult(questionInfo);
    }
}
