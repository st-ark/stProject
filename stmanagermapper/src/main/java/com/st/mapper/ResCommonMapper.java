package com.st.mapper;

import com.st.pojo.ResInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface ResCommonMapper {
    Map<String,Object> selectResInfo(String resId);
    ResInfo selectResInfoAll(String resId);
    int selectResState(String resId);
    Map<String, Object> selectResUp(String redId);
    List<Map<String, Object>> selectResData(String redId);
}
