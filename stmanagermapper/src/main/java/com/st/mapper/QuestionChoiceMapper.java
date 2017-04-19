package com.st.mapper;


import com.st.common.params.QuestionChoice;

public interface QuestionChoiceMapper {

    /**
     * 添加选项
     * @param qc
     * @return
     */
    int addChoice(QuestionChoice qc);
}