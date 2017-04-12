package com.st.mapper;

import com.st.pojo.KnowledgeInfo;
import com.st.pojo.KnowledgeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeInfoMapper {
    int countByExample(KnowledgeInfoExample example);

    int deleteByExample(KnowledgeInfoExample example);

    int deleteByPrimaryKey(Integer knowledgeId);

    int insert(KnowledgeInfo record);

    int insertSelective(KnowledgeInfo record);

    List<KnowledgeInfo> selectByExample(KnowledgeInfoExample example);

    KnowledgeInfo selectByPrimaryKey(Integer knowledgeId);

    int updateByExampleSelective(@Param("record") KnowledgeInfo record, @Param("example") KnowledgeInfoExample example);

    int updateByExample(@Param("record") KnowledgeInfo record, @Param("example") KnowledgeInfoExample example);

    int updateByPrimaryKeySelective(KnowledgeInfo record);

    int updateByPrimaryKey(KnowledgeInfo record);
}