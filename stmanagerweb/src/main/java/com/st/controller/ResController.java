package com.st.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.st.common.pojo.StResult;
import com.st.common.resparam.ResDataList;
import com.st.common.resparam.ResDataParams;
import com.st.common.resparam.ResInfoParams;
import com.st.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 资料controller
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/resource")
public class ResController {
    @Autowired
    private ResService resService;

    @RequestMapping(value = "/find",method = RequestMethod.POST)
    @ResponseBody
    public StResult getResList(  String resId){
        try {
            return  StResult.ok(resService.getResList(resId));
        }catch (Exception e){
            return  StResult.ok(e);
        }
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public StResult addRes(String info,String data){
        try {
            ResInfoParams infoParams = JSONObject.parseObject(info,ResInfoParams.class);

            ResDataList dataList = new ResDataList();
            List<ResDataParams> dataParamsList = new ArrayList<>();
            JSONArray resdataarray = JSONObject.parseArray(data);
            for (Object o : resdataarray){
                ResDataParams jsonObject = JSONObject.parseObject(o.toString(),ResDataParams.class);
                dataParamsList.add(jsonObject);
            }
            dataList.setData(dataParamsList);

            resService.addRes(infoParams,dataList);
            return  StResult.ok("增加成功");
        }catch (Exception e){
            return  StResult.ok(e);
        }
    }
}
