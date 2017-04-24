package com.st.mapper;

import com.st.common.params.QuestionSolve;
import com.st.pojo.QuestionSolveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionSolveMapper {
    /**
     * 添加思路
     * @param qs
     * @return
     */
    int addQuestionSolve(QuestionSolve qs);

    /**
     * 判断该用户是否是上传人
     * @param upId
     * @param solveId
     * @return
     */
    int queryBySolveId(String upId,String solveId);

    /**
     * 修改思路
     * @param qs
     * @return
     */
    int updateSolve(QuestionSolve qs);
}