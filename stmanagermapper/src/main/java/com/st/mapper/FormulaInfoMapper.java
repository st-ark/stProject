package com.st.mapper;

import com.st.pojo.FormulaInfo;
import com.st.pojo.FormulaInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormulaInfoMapper {
    int countByExample(FormulaInfoExample example);

    int deleteByExample(FormulaInfoExample example);

    int deleteByPrimaryKey(String formulaId);

    int insert(FormulaInfo record);

    int insertSelective(FormulaInfo record);

    List<FormulaInfo> selectByExample(FormulaInfoExample example);

    FormulaInfo selectByPrimaryKey(String formulaId);

    int updateByExampleSelective(@Param("record") FormulaInfo record, @Param("example") FormulaInfoExample example);

    int updateByExample(@Param("record") FormulaInfo record, @Param("example") FormulaInfoExample example);

    int updateByPrimaryKeySelective(FormulaInfo record);

    int updateByPrimaryKey(FormulaInfo record);
}