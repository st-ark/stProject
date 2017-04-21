package com.st.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.st.common.packageparam.InfoParams;
import com.st.common.packageparam.QuestionsList;
import com.st.common.packageparam.QuestionsParams;
import com.st.common.pojo.StResult;
import com.st.service.resource.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
@Controller
@RequestMapping("/package")
public class PackageController {

    @Autowired
    private PackageService packageService;

    /**
     * 查询套题
     * @param packageId
     * @param userId
     * @return
     */
    @RequestMapping(value = "/find", method= RequestMethod.POST)
    @ResponseBody
    public StResult getPackageByid(String packageId,String userId){
        try{
            return StResult.ok(packageService.getPackageByid(packageId,userId));
        }catch (Exception e){
            return StResult.ok(e);
        }
    }

    /**
     * 增加套题
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public StResult addPackage(String info, String questions) {
        try {
            InfoParams params = JSONObject.parseObject(info, InfoParams.class);
            QuestionsList params1 = new QuestionsList();
            List<QuestionsParams> questionsParamsList = new ArrayList<>();
            JSONArray jsonArray = JSONObject.parseArray(questions);
            for (Object o : jsonArray){
                QuestionsParams jsonObject = JSONObject.parseObject(o.toString(),QuestionsParams.class);
                questionsParamsList.add(jsonObject);
            }
            params1.setParamsList(questionsParamsList);
            packageService.addPackage(params,params1);
            return StResult.ok("增加成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }

    /**
     * 更新套题
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public StResult updatePackage(String info, String questions) {
        try {
            InfoParams params = JSONObject.parseObject(info, InfoParams.class);
            QuestionsList params1 = new QuestionsList();
            List<QuestionsParams> questionsParamsList = new ArrayList<>();
            JSONArray jsonArray = JSONObject.parseArray(questions);
            for (Object o : jsonArray){
                QuestionsParams jsonObject = JSONObject.parseObject(o.toString(),QuestionsParams.class);
                questionsParamsList.add(jsonObject);
            }
            params1.setParamsList(questionsParamsList);
            packageService.updatePackage(params,params1);
            return StResult.ok("修改成功");
        } catch (Exception e) {
            return StResult.ok(e);
        }
    }
    /**
     * 删除套题
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public StResult deletePackage(String packageId){
        try {
            packageService.deletePackage(packageId);
            return StResult.ok("删除成功");
        }catch (Exception e){
            return StResult.ok(e);
        }
    }
}
