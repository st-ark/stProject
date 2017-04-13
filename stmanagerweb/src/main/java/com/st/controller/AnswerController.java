package com.st.controller;

import com.st.common.params.AnswerParams;
import com.st.common.pojo.StResult;
import com.st.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    @ResponseBody
    public StResult getAnswerList(String questionId) {
        try {
            return StResult.ok(answerService.getAnswerList(questionId));
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 增加答案
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public StResult addAnswer(String userId,String questionId,String url,Integer type, String content) {
        AnswerParams params = new AnswerParams();
        params.setUserId(userId);
        params.setQuestionId(questionId);
        params.setUrl(url);
        params.setType(type);
        params.setContent(content);
        try {
            answerService.addAnswer(params);
            return StResult.ok("增加成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 修改答案
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public StResult addAnswer(String userId, String questionId,String answerId,String url,Integer type,String content) {
        AnswerParams params = new AnswerParams();
        params.setQuestionId(questionId);
        params.setUserId(userId);
        params.setAnswerId(answerId);
        params.setUrl(url);
        params.setType(type);
        params.setContent(content);
        try {
            answerService.updateAnswer(params);
            return StResult.ok("修改成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
    /**
     * 删除答案
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public StResult deleteAnswer(String userId,String questionId,String answerId){
        AnswerParams params = new AnswerParams();
        params.setUserId(userId);
        params.setQuestionId(questionId);
        params.setAnswerId(answerId);
        try {
            answerService.deleteAnswer(params,answerId);
            return StResult.ok("删除成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
}
