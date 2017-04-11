package com.st.mapper;

import com.st.pojo.QuestionAnswer;
import com.st.pojo.QuestionInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/10.
 */
public interface AnswerCommonMapper {
    List<Map<String, Object>> selectAnswerSkill(String questionId);
    Map<String, Object> selectAnswerInfo(String questionId);
    List<Map<String, Object>> selectAnswerRes(String questionId);
    List<Map<String, Object>> selectAnswerSolve(String questionId);
    int selectQuestionState(String questionId);
    int selectAnswerState(String questionId);
    QuestionInfo selectQuestionInfoAll(String questionId);
    void addAnswer(QuestionAnswer answer);
    void updateAnswer(QuestionAnswer answer);
    void deleteAnswer(String answerId);
}