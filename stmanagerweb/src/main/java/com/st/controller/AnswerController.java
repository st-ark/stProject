package com.st.controller;

import com.st.common.pojo.AnswerParams;
import com.st.common.pojo.StResult;
import com.st.pojo.QuestionAnswer;
import com.st.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 答案controller
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/answer")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    /**
     * 查询答案信息
     */
    @RequestMapping("/find/{questionId}")
    @ResponseBody
    public StResult getAnswerList(@PathVariable String questionId) {
        try {
            return StResult.ok(answerService.getAnswerList(questionId));
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 增加答案
     */
    @RequestMapping("/add/{userId}&{questionId}&{url}&{type}&{content}")
    @ResponseBody
    public StResult addAnswer(@PathVariable String userId, @PathVariable String questionId, @PathVariable String url, @PathVariable Integer type, @PathVariable String content) {
        AnswerParams params = new AnswerParams();
        params.setUserId(userId);
        params.setQuestionId(questionId);
        params.setUrl(url);
        params.setType(type);
        params.setContent(content);
        try {
            return StResult.ok(answerService.addAnswer(params));
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 修改答案
     */
    @RequestMapping("/update/{userId}&{questionId}&{answerId}&{url}&{type}&{content}")
    @ResponseBody
    public StResult addAnswer(@PathVariable String userId, @PathVariable String questionId,@PathVariable String answerId, @PathVariable String url, @PathVariable Integer type, @PathVariable String content) {
        AnswerParams params = new AnswerParams();
        params.setQuestionId(questionId);
        params.setUserId(userId);
        params.setAnswerId(answerId);
        params.setUrl(url);
        params.setType(type);
        params.setContent(content);
        try {
            return StResult.ok(answerService.updateAnswer(params));
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
    /**
     * 删除答案
     */
    @RequestMapping("/delete/{userId}&{questionId}&{answerId}")
    @ResponseBody
    public StResult deleteAnswer(@PathVariable String userId,@PathVariable String questionId,@PathVariable String answerId){
        AnswerParams params = new AnswerParams();
        params.setUserId(userId);
        params.setQuestionId(questionId);
        params.setAnswerId(answerId);
        try {
            return StResult.ok(answerService.deleteAnswer(params,answerId));
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
}
