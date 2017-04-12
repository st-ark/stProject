package com.st.mapper;

import com.st.pojo.QuestionSolve;
import com.st.pojo.QuestionSolveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionSolveMapper {
    int countByExample(QuestionSolveExample example);

    int deleteByExample(QuestionSolveExample example);

    int deleteByPrimaryKey(String solveId);

    int insert(QuestionSolve record);

    int insertSelective(QuestionSolve record);

    List<QuestionSolve> selectByExample(QuestionSolveExample example);

    QuestionSolve selectByPrimaryKey(String solveId);

    int updateByExampleSelective(@Param("record") QuestionSolve record, @Param("example") QuestionSolveExample example);

    int updateByExample(@Param("record") QuestionSolve record, @Param("example") QuestionSolveExample example);

    int updateByPrimaryKeySelective(QuestionSolve record);

    int updateByPrimaryKey(QuestionSolve record);
}