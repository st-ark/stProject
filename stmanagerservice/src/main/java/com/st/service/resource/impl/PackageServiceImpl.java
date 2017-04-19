package com.st.service.resource.impl;

import com.st.common.packageparam.InfoParams;
import com.st.common.packageparam.QuestionsList;
import com.st.common.packageparam.QuestionsParams;
import com.st.common.pojo.StResult;
import com.st.common.utils.IDUtils;
import com.st.mapper.PackageCommonMapper;
import com.st.mapper.UserCommonMapper;
import com.st.pojo.PackageInfo;
import com.st.pojo.UserInfo;
import com.st.service.resource.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageCommonMapper packageCommonMapper;

   @Autowired
    private UserCommonMapper userCommonMapper;

    /**
     *根据 id 加载 一套题（ 10 道） 的
     */
    @Override
    public Map<String, Object> getPackageByid(String packageId,String userId) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (packageId == null || packageId.trim().length()==0) {
            throw new RuntimeException("套题id不能为空");
        }
        if (packageCommonMapper.selectPackageInfo(packageId)==null){
            throw new RuntimeException("套题不存在");
        }
        if (userId == null || userId.trim().length()==0){
            throw new RuntimeException("用户id不能为空");
        }
        UserInfo userInfo = userCommonMapper.selectUserInfoAll(userId);
        if (userInfo==null){
            throw new RuntimeException("用户不存在");
        }
        //一般用户
        if (userInfo.getType() == -1){
            map.put("questions",getVIP(packageId));
        }else if (userInfo.getType()==-2){
            //付费用户
            map.put("questions",getSVIP(packageId));
        }
        map.put("info",getInfo(packageId));
        map.put("up",getUp(packageId));
        return map;
    }
    private Object getVIP(String packageId){
        List<Map<String,Object>> list= packageCommonMapper.selectByVIP(packageId);
        return StResult.ok(list).getData();
    }
    private Object getSVIP(String packageId){
        List<Map<String,Object>> list = packageCommonMapper.selectBySVIP(packageId);
        return StResult.ok(list).getData();
    }
    private Object getUp(String packageId) {
      Map<String, Object> map = packageCommonMapper.selectPackageUp(packageId);
        return StResult.ok(map).getData();
    }
    private Object getInfo(String packageId) {
        Map<String, Object> map = packageCommonMapper.selectPackageInfo(packageId);
        return StResult.ok(map).getData();
    }

    /**
     * 增加套题
     */
    @Override
    public void addPackage(InfoParams infoParams, QuestionsList questionsList) {
        if (infoParams.getUpId() == null || infoParams.getUpId().trim().length()==0){
            throw new RuntimeException("用户id不能为空");
        }
        UserInfo userInfo = userCommonMapper.selectUserInfoAll(infoParams.getUpId());
        if (userInfo==null){
            throw new RuntimeException("用户不存在");
        }
        infoParams.setPackageId(IDUtils.createId());
        packageCommonMapper.addPackageInfo(infoParams);
        List<QuestionsParams> questionsParamsList = questionsList.getParamsList();
        for (QuestionsParams questionsParams: questionsParamsList){
            questionsParams.setPackageId(infoParams.getPackageId());
            packageCommonMapper.addPackageQuestions(questionsParams);
        }
    }

    /**
     * 修改套题
     */
    @Override
    public void updatePackage(InfoParams infoParams, QuestionsList questionsList) {
        if (infoParams.getUpId() == null || infoParams.getUpId().trim().length()==0){
            throw new RuntimeException("用户id不能为空");
        }
        UserInfo userInfo = userCommonMapper.selectUserInfoAll(infoParams.getUpId());
        if (userInfo==null){
            throw new RuntimeException("用户不存在");
        }
        packageCommonMapper.updatePackageInfo(infoParams);
        List<QuestionsParams> questionsParamsList = questionsList.getParamsList();
        for (QuestionsParams questionsParams: questionsParamsList){
            questionsParams.setPackageId(infoParams.getPackageId());
            packageCommonMapper.updatePackageQuestions(questionsParams);
        }
    }

    /**
     * 删除套题
     */
    @Override
    public void deletePackage(String packageId) {
        packageCommonMapper.deletePackageInfo(packageId);
        packageCommonMapper.deletePackageQuestions(packageId);
    }
}
