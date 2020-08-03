package com.yjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author mua
 * @Date 2020/8/3 11:13
 */

@Controller
public class IndexController {

    @GetMapping("/index")
    public String toLogin(){
        return "login";
    }
}
