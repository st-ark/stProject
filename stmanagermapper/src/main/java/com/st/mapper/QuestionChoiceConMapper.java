package com.st.mapper;

import org.apache.ibatis.annotations.Param;

public interface QuestionChoiceConMapper {

    /**
     * 添加关联表
     * @param qId
     * @param cId
     * @return
     */
    int addquestionChoiceCon(@Param("qId") String qId, @Param("cId") String cId);
}