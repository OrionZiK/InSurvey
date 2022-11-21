package com.zinc.springbootshiro1.controller;

import com.sun.org.apache.bcel.internal.classfile.Unknown;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(String username,String password){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封住用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
           subject.login(token);
           return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("msg", "用户名错误");
            subject.login(token);
            //执行登录方法，如果没有异常就说明ok了

        }catch(IncorrectCredentialsException e){
            //用户名不存在
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }
}
