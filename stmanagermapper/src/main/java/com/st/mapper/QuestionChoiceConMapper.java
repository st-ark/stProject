package com.st.mapper;

import com.st.pojo.QuestionChoiceCon;
import com.st.pojo.QuestionChoiceConExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionChoiceConMapper {
    int countByExample(QuestionChoiceConExample example);

    int deleteByExample(QuestionChoiceConExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionChoiceCon record);

    int insertSelective(QuestionChoiceCon record);

    List<QuestionChoiceCon> selectByExample(QuestionChoiceConExample example);

    QuestionChoiceCon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionChoiceCon record, @Param("example") QuestionChoiceConExample example);

    int updateByExample(@Param("record") QuestionChoiceCon record, @Param("example") QuestionChoiceConExample example);

    int updateByPrimaryKeySelective(QuestionChoiceCon record);

    int updateByPrimaryKey(QuestionChoiceCon record);
}