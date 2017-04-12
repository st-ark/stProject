package com.st.mapper;

import com.st.pojo.QuestionChoice;
import com.st.pojo.QuestionChoiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionChoiceMapper {
    int countByExample(QuestionChoiceExample example);

    int deleteByExample(QuestionChoiceExample example);

    int deleteByPrimaryKey(String choiceId);

    int insert(QuestionChoice record);

    int insertSelective(QuestionChoice record);

    List<QuestionChoice> selectByExample(QuestionChoiceExample example);

    QuestionChoice selectByPrimaryKey(String choiceId);

    int updateByExampleSelective(@Param("record") QuestionChoice record, @Param("example") QuestionChoiceExample example);

    int updateByExample(@Param("record") QuestionChoice record, @Param("example") QuestionChoiceExample example);

    int updateByPrimaryKeySelective(QuestionChoice record);

    int updateByPrimaryKey(QuestionChoice record);
}