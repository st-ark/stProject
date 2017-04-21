package com.st.mapper;

import com.st.pojo.QuestionSolve;
import com.st.pojo.QuestionSolveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionSolveMapper {
    /**
     * 添加思路
     * @param qs
     * @return
     */
    int addQuestionSolve(com.st.common.params.QuestionSolve qs);
}