package com.zinc.springbootshiro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author OrionZinc
 * @date 2022/11/15 16:12
 */
@Controller
public class MyConrtroller {
    @RequestMapping({"/","/index"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello,Shiro");
        return "index";
    }
    @RequestMapping("/user/add")
    public String add(){
        return "user/add";
    }
    @RequestMapping("/user/update")
    public String update(){
        return "user/update.html";
    }

}
