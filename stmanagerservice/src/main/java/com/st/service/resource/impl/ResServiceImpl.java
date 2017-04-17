package com.st.service.resource.impl;


import com.st.common.resparam.ResDataList;
import com.st.common.resparam.ResDataParams;
import com.st.common.resparam.ResInfoParams;
import com.st.common.utils.GetState;
import com.st.common.pojo.StResult;
import com.st.common.utils.IDUtils;
import com.st.mapper.ResCommonMapper;
import com.st.mapper.UserCommonMapper;
import com.st.pojo.*;
import com.st.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 资料模块实现
 * Created by Administrator on 2017/4/10.
 */
@Service
public class ResServiceImpl implements  ResService {
    @Autowired
    private ResCommonMapper resCommonMapper;

    @Autowired
    private UserCommonMapper userCommonMapper;

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

    /**
     * 增加资料
     */
     @Override
    public void addRes(ResInfoParams resInfoParams, ResDataList list) {
        //判断权限
        ResInfo resInfo = judgeId(resInfoParams);
        resInfo.setResId(IDUtils.createId());
        resInfo.setEditdate(new Date());
        resInfo.setKnowledgeId(resInfoParams.getKnowledgeId());
        resInfo.setTitle(resInfoParams.getTitle());
        resInfo.setType(resInfoParams.getType());
        resInfo.setUserId(resInfoParams.getUpId());
        resInfo.setState(0);
        resInfo.setThumbDown(0l);
        resInfo.setThumbUp(0l);
        resInfoParams.setResId(resInfo.getResId());
        //增加资料信息
        resCommonMapper.addResInfo(resInfo);
         //关联资料内容表
        ResData resData = new ResData();
         //关联资料id表
         ResDataCon resDataCon = new ResDataCon();
         List<ResDataParams> dataParams = list.getData();
        for (ResDataParams params : dataParams ) {
            resData.setDataId(IDUtils.createId());
            resData.setContent(params.getContent());
            resData.setType(params.getType());
            resDataCon.setResId(resInfo.getResId());
            resDataCon.setDataId(resData.getDataId());
            //增加资料内容
            resCommonMapper.addResData(resData);
            //id表更新
            resCommonMapper.addResDataCon(resDataCon);
        }
    }

    /**
     * 修改资料
     */
    @Override
    public void updateRes(ResInfoParams resInfoParams, ResDataList dataList) {
        ResInfo resInfo = judgeId(resInfoParams);
        resInfo.setTitle(resInfoParams.getTitle());
        resInfo.setType(resInfoParams.getType());
        resInfo.setKnowledgeId(resInfoParams.getKnowledgeId());
        resInfoParams.setResId(resInfo.getResId());
        resCommonMapper.updateResInfo(resInfo);
        //关联资料内容表
        ResData resData = new ResData();
        //关联资料id表
        ResDataCon resDataCon = new ResDataCon();
        List<ResDataParams> dataParams = dataList.getData();
        for (ResDataParams params : dataParams ) {
            resData.setContent(params.getContent());
            resData.setType(params.getType());
            resDataCon.setResId(resInfo.getResId());
            resDataCon.setDataId(resData.getDataId());
            //增加资料内容
            resCommonMapper.updateResData(resData);
            //id表更新
            resCommonMapper.addResDataCon(resDataCon);
        }
    }

    /**
     * 判断权限
     */
    public ResInfo judgeId(ResInfoParams resInfoParams) {
        if (resInfoParams.getUpId() == null || resInfoParams.getUpId().trim().length() == 0) {
            throw new RuntimeException("userId不能为空");
        }
        UserInfo userInfo = userCommonMapper.selectUserInfoAll(resInfoParams.getUpId());
        if (userInfo == null) {
            throw new RuntimeException("用户不存在");
        }
        ResInfo resInfo = new ResInfo();
        return resInfo;
    }

}