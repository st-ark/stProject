package com.st.mapper;



import com.st.common.params.QuestionSolveCon;


public interface QuestionSolveConMapper {


    /**
     *
     * @param id
     * @return
     * 根据解题思路id查询所有信息
     */
    com.st.pojo.QuestionSolveCon getSolveByid (String id);


    /**
     * 添加错法
     * @param qsc
     * @return
     */

    int addQuestionSolveCon(QuestionSolveCon qsc);


}