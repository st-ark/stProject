package com.st.service.resource;

import com.st.common.packageparam.InfoParams;
import com.st.common.packageparam.QuestionsList;
import com.st.common.packageparam.QuestionsParams;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
public interface PackageService {
    Map<String,Object> getPackageByid(String packageId,String userId);
    void addPackage(InfoParams infoParams, QuestionsList questionsList);
    void updatePackage(InfoParams infoParams,QuestionsList questionsList);
    void deletePackage(String packageId);
}
