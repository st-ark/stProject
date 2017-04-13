package com.st.mapper;

import com.st.pojo.ResData;
import com.st.pojo.ResDataCon;
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
    void addResInfo(ResInfo resInfo);
    void updateResInfo(ResInfo resInfo);
    void deleteResInfo(ResInfo resInfo);
    void updateResData(ResData resData);
    void addResData(ResData resData);
    void deleteResData(String resDataId);
    void addResDataCon(ResDataCon resDataCon);
}
