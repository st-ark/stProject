package com.st.mapper;

import com.st.pojo.PackageInfo;
import com.st.pojo.PackageInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageInfoMapper {
    int countByExample(PackageInfoExample example);

    int deleteByExample(PackageInfoExample example);

    int deleteByPrimaryKey(String packageId);

    int insert(PackageInfo record);

    int insertSelective(PackageInfo record);

    List<PackageInfo> selectByExample(PackageInfoExample example);

    PackageInfo selectByPrimaryKey(String packageId);

    int updateByExampleSelective(@Param("record") PackageInfo record, @Param("example") PackageInfoExample example);

    int updateByExample(@Param("record") PackageInfo record, @Param("example") PackageInfoExample example);

    int updateByPrimaryKeySelective(PackageInfo record);

    int updateByPrimaryKey(PackageInfo record);
}