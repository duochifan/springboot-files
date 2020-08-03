package com.yjh.controller;

import com.yjh.entity.User;
import com.yjh.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author mua
 * @Date 2020/8/3 10:58
 */
@Controller
@RequestMapping("user")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 登录方法
     * @param user
     * @return
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session){
        User userDB = userService.login(user);
        if (userDB !=null){
            session.setAttribute("user",userDB);
            return "redirect:/file/showAll";
        }else{
            return "redirect:/index";
        }
    }
}
