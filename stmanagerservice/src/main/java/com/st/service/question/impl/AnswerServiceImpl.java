package com.st.service.question.impl;


import com.st.common.answerparam.*;
import com.st.common.params.answerparam.*;
import com.st.common.utils.GetState;
import com.st.common.pojo.StResult;
import com.st.common.utils.IDUtils;
import com.st.mapper.AnswerCommonMapper;
import com.st.mapper.UserCommonMapper;
import com.st.pojo.*;
import com.st.service.question.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 答案模块实现
 * Created by Administrator on 2017/4/10.
 */
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerCommonMapper answerCommonMapper;

    @Autowired
    private UserCommonMapper userCommonMapper;

    /**
     * 查询答案信息
     */
    @Override
    public Map<String, Object> getAnswerList(String questionId) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (questionId == null || questionId.trim().length() == 0) {
            throw new RuntimeException("questionId不能为空");
        }
        if (answerCommonMapper.selectQuestionInfoAll(questionId) == null) {
            throw new RuntimeException("该题不存在");
        }
        if (GetState.getState(answerCommonMapper.selectQuestionState(questionId)) != "发布") {
            throw new RuntimeException(GetState.getState(answerCommonMapper.selectQuestionState(questionId)));
        }
//        if (GetState.getState(answerCommonMapper.selectAnswerState(questionId)) != "发布") {
//            throw new RuntimeException(GetState.getState(answerCommonMapper.selectAnswerState(questionId)));
//        }

        map.put("info", getInfo(questionId));
        map.put("skill", getSkill(questionId));
        map.put("res", getRes(questionId));
        map.put("solve", getSolve(questionId));
        return map;
    }

    private Object getInfo(String questionId) {
        Map<String, Object> list = answerCommonMapper.selectAnswerInfo(questionId);
        return StResult.ok(list).getData();
    }

    private Object getSkill(String questionId) {
        List<Map<String, Object>> list = answerCommonMapper.selectAnswerSkill(questionId);
        return StResult.ok(list).getData();
    }

    private Object getRes(String questionId) {
        List<Map<String, Object>> list = answerCommonMapper.selectAnswerRes(questionId);
        return StResult.ok(list).getData();
    }

    private Object getSolve(String questionId) {
        List<Map<String, Object>> list = answerCommonMapper.selectAnswerSolve(questionId);
        return StResult.ok(list).getData();
    }

    /**
     * 增加答案
     */
    @Override
    public QuestionAnswer addAnswer(AnswerParams params, SkillList skillList, ResList resList) {
        QuestionAnswer answer = judgeId(params);
        answer.setAnswerId(IDUtils.createId());
        answer.setContent(params.getContent());
        answer.setEditDate(new Date());
        answer.setType(params.getType());
        answer.setUrl(params.getUrl());
        answer.setUpId(params.getUserId());
        params.setAnswerId(answer.getAnswerId());
        answerCommonMapper.addAnswer(answer);
        answerCommonMapper.updateQuestionInfo(params);

        QuestionSkillCon skillCon = new QuestionSkillCon();
        List<SkillParams> stringSkill = skillList.getSkillParams();
        for (SkillParams skillParams : stringSkill) {
            skillCon.setQuestionId(params.getQuestionId());
            skillCon.setSkillId(skillParams.getSkillId());
            answerCommonMapper.addQuestionSkillCon(skillCon);
        }

        QuestionResCon resCon = new QuestionResCon();
        List<ResParams> stringRes = resList.getResParams();
        for (ResParams resParams : stringRes) {
            resCon.setQuestionId(params.getQuestionId());
            resCon.setResId(resParams.getResId());
            answerCommonMapper.addQuestionResCon(resCon);
        }
        return answer;
    }

    /**
     * 修改答案
     */
    @Override
    public QuestionAnswer updateAnswer(AnswerParams params,SkillList skillList,ResList resList) {
        QuestionAnswer answer = judgeId(params);
        answer.setContent(params.getContent());
        answer.setEditDate(new Date());
        answer.setType(params.getType());
        answer.setUrl(params.getUrl());
        answer.setAnswerId(params.getAnswerId());
        answerCommonMapper.updateAnswer(answer);

        List<SkillParams> stringSkill = skillList.getSkillParams();
        for (SkillParams skillParams : stringSkill) {
            answerCommonMapper.updateQuestionSkillCon(skillParams.getSkillId());
        }
        List<ResParams> stringRes = resList.getResParams();
        for (ResParams resParams : stringRes) {
            answerCommonMapper.updateQuestionResCon(resParams.getResId());
        }
        return answer;
    }

    /**
     * 删除答案
     */
    @Override
    public QuestionAnswer deleteAnswer(AnswerParams params, String answerId) {
        QuestionAnswer answer = judgeId(params);
        params.setAnswerId(answer.getAnswerId());
        params.setQuestionId(params.getQuestionId());
        answerCommonMapper.deleteAnswer(answerId);
        answerCommonMapper.updateQuestionInfo(params);
        return answer;
    }

    /**
     * 判断权限
     */
    private QuestionAnswer judgeId(AnswerParams params) {
        if (params.getUserId() == null || params.getUserId().trim().length() == 0) {
            throw new RuntimeException("userId不能为空");
        }
        UserInfo userInfo = userCommonMapper.selectUserInfoAll(params.getUserId());
        if (userInfo == null) {
            throw new RuntimeException("用户不存在");
        }
        if (params.getQuestionId() == null || params.getQuestionId().trim().length() == 0) {
            throw new RuntimeException("questionId不能为空");
        }
        QuestionInfo questionInfo = answerCommonMapper.selectQuestionInfoAll(params.getQuestionId());
        if (questionInfo == null) {
            throw new RuntimeException("题目不存在");
        }
        QuestionAnswer answer = new QuestionAnswer();
        return answer;
    }
}


