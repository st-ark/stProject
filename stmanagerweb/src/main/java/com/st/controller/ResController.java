package com.st.controller;

import com.st.common.pojo.StResult;
import com.st.service.AnswerService;
import com.st.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 资料controller
 * Created by Administrator on 2017/4/10.
 */
@Controller
public class ResController {
    @Autowired
    private ResService resService;

    @RequestMapping("/resource/{resId}")
    @ResponseBody
    public StResult getAnswerList(@PathVariable String resId){
        try {
            return  StResult.ok(resService.getResList(resId));
        }catch (Exception e){
            return  StResult.ok(e);
        }
    }
}
