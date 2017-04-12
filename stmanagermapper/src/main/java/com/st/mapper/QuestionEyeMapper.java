package com.st.mapper;

import com.st.pojo.QuestionEye;
import com.st.pojo.QuestionEyeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionEyeMapper {
    int countByExample(QuestionEyeExample example);

    int deleteByExample(QuestionEyeExample example);

    int deleteByPrimaryKey(String eyeId);

    int insert(QuestionEye record);

    int insertSelective(QuestionEye record);

    List<QuestionEye> selectByExample(QuestionEyeExample example);

    QuestionEye selectByPrimaryKey(String eyeId);

    int updateByExampleSelective(@Param("record") QuestionEye record, @Param("example") QuestionEyeExample example);

    int updateByExample(@Param("record") QuestionEye record, @Param("example") QuestionEyeExample example);

    int updateByPrimaryKeySelective(QuestionEye record);

    int updateByPrimaryKey(QuestionEye record);
}