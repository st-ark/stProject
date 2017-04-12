package com.st.mapper;

import com.st.pojo.QuestionInfo;
import com.st.pojo.QuestionInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionInfoMapper {

    int countByExample(QuestionInfoExample example);

    int deleteByExample(QuestionInfoExample example);

    int deleteByPrimaryKey(String questionId);

    int insert(QuestionInfo record);

    int insertSelective(QuestionInfo record);

    List<QuestionInfo> selectByExample(QuestionInfoExample example);

    QuestionInfo selectByPrimaryKey(String questionId);

    QuestionInfo selectByQuestionId(String questionId);

    int updateByExampleSelective(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    int updateByExample(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    int updateByPrimaryKeySelective(QuestionInfo record);

    int updateByPrimaryKey(QuestionInfo record);

    /**
     * 根据题目id查询所属试卷信息，卷名
     * */
    QuestionInfo getQuestionByid(String id);


    /**
     * 根据题目id查询判断题型，为选择题则查询选项
     * */
    QuestionInfo queryChoiceByQId(String id);
}