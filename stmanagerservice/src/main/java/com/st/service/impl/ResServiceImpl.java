package com.st.service.impl;


import com.st.common.utils.GetState;
import com.st.common.pojo.StResult;
import com.st.mapper.ResCommonMapper;
import com.st.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 资料模块实现
 * Created by Administrator on 2017/4/10.
 */
@Service
public class ResServiceImpl implements ResService {
    @Autowired
    private ResCommonMapper resCommonMapper;

    /**
     * 查询资料
     */
    @Override
    public Map<String, Object> getResList(String resId) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (resId == null || resCommonMapper.selectResInfoAll(resId) == null) {
            throw new RuntimeException("该资料不存在");
        }
        if (GetState.getState(resCommonMapper.selectResState(resId)) != "发布") {
            throw new RuntimeException(GetState.getState(resCommonMapper.selectResState(resId)));
        }
        map.put("info", getInfo(resId));
        map.put("up", getUp(resId));
        map.put("data", getData(resId));

        return map;
    }

    private Object getInfo(String resId) {
        Map<String, Object> list = resCommonMapper.selectResInfo(resId);
        return StResult.ok(list).getData();
    }

    private Object getUp(String resId) {
        Map<String, Object> list = resCommonMapper.selectResUp(resId);
        return StResult.ok(list).getData();
    }

    private Object getData(String resId) {
        List<Map<String, Object>> list = resCommonMapper.selectResData(resId);
        return StResult.ok(list).getData();
    }
}