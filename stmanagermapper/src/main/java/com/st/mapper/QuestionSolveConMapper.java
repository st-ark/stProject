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

    /**
     * 修改错法
     * @param qsc
     * @return
     */
    int updateQuestionSolveCon(QuestionSolveCon qsc);


    /**
     * 删除原来的eyeId
     * @param eyeIdOld
     * @return
     */
    int delEyeById(String eyeIdOld);

    /**
     * 判断用户是否有删除权限
     * @param upId
     * @param solveId
     * @return
     */
    int queryUserById(String upId,String solveId);

    /**
     * 根据solveId删除解题思路
     * @return
     */
    int delQoestionSolveById(String solveId);

}