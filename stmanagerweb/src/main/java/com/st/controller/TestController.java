package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String showIndex(){
        return "index";
    }

}
