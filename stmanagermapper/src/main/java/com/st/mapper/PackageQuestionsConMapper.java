package com.st.mapper;

import com.st.pojo.PackageQuestionsCon;
import com.st.pojo.PackageQuestionsConExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageQuestionsConMapper {
    int countByExample(PackageQuestionsConExample example);

    int deleteByExample(PackageQuestionsConExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PackageQuestionsCon record);

    int insertSelective(PackageQuestionsCon record);

    List<PackageQuestionsCon> selectByExample(PackageQuestionsConExample example);

    PackageQuestionsCon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PackageQuestionsCon record, @Param("example") PackageQuestionsConExample example);

    int updateByExample(@Param("record") PackageQuestionsCon record, @Param("example") PackageQuestionsConExample example);

    int updateByPrimaryKeySelective(PackageQuestionsCon record);

    int updateByPrimaryKey(PackageQuestionsCon record);
}