package com.st.mapper;

import com.st.pojo.TestInfo;
import com.st.pojo.TestInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestInfoMapper {
    int countByExample(TestInfoExample example);

    int deleteByExample(TestInfoExample example);

    int deleteByPrimaryKey(String testId);

    int insert(TestInfo record);

    int insertSelective(TestInfo record);

    List<TestInfo> selectByExample(TestInfoExample example);

    TestInfo selectByPrimaryKey(String testId);

    int updateByExampleSelective(@Param("record") TestInfo record, @Param("example") TestInfoExample example);

    int updateByExample(@Param("record") TestInfo record, @Param("example") TestInfoExample example);

    int updateByPrimaryKeySelective(TestInfo record);

    int updateByPrimaryKey(TestInfo record);
}