package com.st.controller;

import com.st.common.params.ParseUrl;
import com.st.common.params.ResDataParams;
import com.st.common.params.ResInfoParams;
import com.st.common.pojo.StResult;
import com.st.service.AnswerService;
import com.st.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 资料controller
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/resource")
public class ResController {
    @Autowired
    private ResService resService;

    @RequestMapping(value = "/find/{resId}",method = RequestMethod.GET)
    @ResponseBody
    public StResult getResList(@PathVariable  String resId){
        try {
            return  StResult.ok(resService.getResList(resId));
        }catch (Exception e){
            return  StResult.ok(e);
        }
    }
    @RequestMapping(value = "/add/{title}&{type}&{knowledgeId}&{upId}&{map}",method = RequestMethod.GET)
    @ResponseBody
    public StResult addRes(@PathVariable String title,@PathVariable int type,@PathVariable Long knowledgeId,@PathVariable String upId,@PathVariable String map){
        try {
            ResInfoParams infoParams = new ResInfoParams();
            infoParams.setTitle(title);
            infoParams.setType(type);
            infoParams.setKnowledgeId(knowledgeId);
            infoParams.setUpId(upId);
            Map<String,Object> mapUrl = ParseUrl.getUrlParams(map);
            ResDataParams[] dataParams = new ResDataParams[mapUrl.size()];
            int count = 0;
            for (Map.Entry<String, Object> entry : mapUrl.entrySet()) {
                dataParams[count].setContent((String) entry.getKey());
                dataParams[count].setType(Integer.parseInt(entry.getValue().toString()));
                count++;
            }
            resService.addRes(infoParams,dataParams);
            return StResult.ok("增加成功");
        }catch (Exception e){
            return StResult.ok(e);
        }
    }
}
