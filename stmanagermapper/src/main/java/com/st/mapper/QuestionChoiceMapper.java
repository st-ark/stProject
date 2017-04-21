package com.st.mapper;


import com.st.common.params.QuestionChoice;

import java.util.List;

public interface QuestionChoiceMapper {

    /**
     * 添加选项
     * @param qc
     * @return
     */
    int addChoice(QuestionChoice qc);

    /**
     * 修改选项
     * @param qc
     * @return
     */
    int updateQuestionChoice(QuestionChoice qc);
}