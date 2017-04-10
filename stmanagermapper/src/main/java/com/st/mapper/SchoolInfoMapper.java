package com.st.mapper;

import com.st.pojo.SchoolInfo;
import com.st.pojo.SchoolInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolInfoMapper {
    int countByExample(SchoolInfoExample example);

    int deleteByExample(SchoolInfoExample example);

    int deleteByPrimaryKey(String schoolId);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    SchoolInfo selectByPrimaryKey(String schoolId);

    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByPrimaryKeySelective(SchoolInfo record);

    int updateByPrimaryKey(SchoolInfo record);
}