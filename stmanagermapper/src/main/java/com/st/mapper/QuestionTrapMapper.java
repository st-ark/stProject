package com.st.mapper;

import com.st.pojo.QuestionTrap;
import com.st.pojo.QuestionTrapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionTrapMapper {
    int countByExample(QuestionTrapExample example);

    int deleteByExample(QuestionTrapExample example);

    int deleteByPrimaryKey(String trapId);

    int insert(QuestionTrap record);

    int insertSelective(QuestionTrap record);

    List<QuestionTrap> selectByExample(QuestionTrapExample example);

    QuestionTrap selectByPrimaryKey(String trapId);

    int updateByExampleSelective(@Param("record") QuestionTrap record, @Param("example") QuestionTrapExample example);

    int updateByExample(@Param("record") QuestionTrap record, @Param("example") QuestionTrapExample example);

    int updateByPrimaryKeySelective(QuestionTrap record);

    int updateByPrimaryKey(QuestionTrap record);
}