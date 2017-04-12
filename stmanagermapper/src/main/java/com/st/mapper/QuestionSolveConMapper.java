package com.st.mapper;

import com.st.pojo.QuestionSolveCon;
import com.st.pojo.QuestionSolveConExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QuestionSolveConMapper {
    int countByExample(QuestionSolveConExample example);

    int deleteByExample(QuestionSolveConExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionSolveCon record);

    int insertSelective(QuestionSolveCon record);

    List<QuestionSolveCon> selectByExample(QuestionSolveConExample example);

    QuestionSolveCon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionSolveCon record, @Param("example") QuestionSolveConExample example);

    int updateByExample(@Param("record") QuestionSolveCon record, @Param("example") QuestionSolveConExample example);

    int updateByPrimaryKeySelective(QuestionSolveCon record);

    int updateByPrimaryKey(QuestionSolveCon record);

    /**
     *
     * @param id
     * @return
     * 根据解题思路id查询所有信息
     */
    QuestionSolveCon getSolveByid (String id);
}