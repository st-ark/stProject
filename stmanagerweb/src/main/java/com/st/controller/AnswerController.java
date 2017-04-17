package com.st.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.st.common.answerparam.*;
import com.st.common.params.answerparam.*;
import com.st.common.pojo.StResult;
import com.st.service.question.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "/find", method = RequestMethod.POST)
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
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public StResult addAnswer(String info, String skill, String res) {
        try {
            AnswerParams params = JSONObject.parseObject(info, AnswerParams.class);
            SkillList skillList = new SkillList();
            List<SkillParams> skillParams = new ArrayList<>();
            JSONArray skillarray = JSONObject.parseArray(skill);
            for (Object o : skillarray){
                SkillParams jsonObject = JSONObject.parseObject(o.toString(),SkillParams.class);
                skillParams.add(jsonObject);
            }
            skillList.setSkillParams(skillParams);

            ResList resList = new ResList();
            List<ResParams> resParams = new ArrayList<>();
            JSONArray resarray = JSONObject.parseArray(res);
            for (Object o : resarray){
                ResParams jsonObject = JSONObject.parseObject(o.toString(), ResParams.class);
                resParams.add(jsonObject);
            }
            resList.setResParams(resParams);
            answerService.addAnswer(params, skillList, resList);
            return StResult.ok("增加成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 修改答案
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public StResult updateAnswer(String info, String skill, String res) {
        try {
            AnswerParams params = JSONObject.parseObject(info, AnswerParams.class);
            SkillList skillList = new SkillList();
            List<SkillParams> skillParams = new ArrayList<>();
            JSONArray skillarray = JSONObject.parseArray(skill);
            for (Object o : skillarray){
                SkillParams jsonObject = JSONObject.parseObject(o.toString(),SkillParams.class);
                skillParams.add(jsonObject);
            }
            skillList.setSkillParams(skillParams);

            ResList resList = new ResList();
            List<ResParams> resParams = new ArrayList<>();
            JSONArray resarray = JSONObject.parseArray(res);
            for (Object o : resarray){
                ResParams jsonObject = JSONObject.parseObject(o.toString(), ResParams.class);
                resParams.add(jsonObject);
            }
            resList.setResParams(resParams);

            answerService.updateAnswer(params, skillList, resList);
            return StResult.ok("修改成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 删除答案
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public StResult deleteAnswer(String userId, String questionId, String answerId) {
        AnswerParams params = new AnswerParams();
        params.setUserId(userId);
        params.setQuestionId(questionId);
        params.setAnswerId(answerId);
        try {
            answerService.deleteAnswer(params, answerId);
            return StResult.ok("删除成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
}
