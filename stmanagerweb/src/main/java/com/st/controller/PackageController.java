package com.st.controller;

import com.st.common.pojo.StResult;
import com.st.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
@Controller
@RequestMapping("/pc")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @ResponseBody
    @RequestMapping(value = "/getPackageByid/{id}&{uId}", method= RequestMethod.GET)
    public StResult getPackageByid(@PathVariable String id,@PathVariable String uId)
    {
        try{
            return StResult.ok(packageService.getPackageByid(id,uId));
        }catch (Exception e){
            return StResult.ok(e);
        }
    }
}
