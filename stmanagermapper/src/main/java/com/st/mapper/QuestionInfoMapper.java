package com.st.mapper;

import com.st.pojo.QuestionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionInfoMapper {


    /**
     * 根据题目id查询所属试卷信息，卷名
     * */
    QuestionInfo getQuestionByid(String id);


    /**
     * 根据题目id查询判断题型，为选择题则查询选项
     * */
    QuestionInfo queryChoiceByQId(String id);
}