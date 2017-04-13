package com.st.service;

import com.st.common.params.ResDataParams;
import com.st.common.params.ResInfoParams;

import java.util.List;
import java.util.Map;

/**
 * 资料详细信息
 * Created by Administrator on 2017/4/11.
 */
public interface ResService {
    /**
     * 查找资料
     */
    Map<String,Object> getResList(String resId);
    /**
     * 增加资料
     */
    void addRes(ResInfoParams resInfoParams, ResDataParams[] resDataParams);
}
