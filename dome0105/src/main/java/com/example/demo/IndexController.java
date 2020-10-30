package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("index")
    //@ResponseBody ：返回json字符串
    @ResponseBody
    public String index(){
        return "hello idea springboot";
    }

}
