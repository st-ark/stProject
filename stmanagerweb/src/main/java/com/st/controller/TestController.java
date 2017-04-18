package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String showIndex(){
        return "test";
    }
}
