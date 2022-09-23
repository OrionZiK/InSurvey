package com.zinc.authoritydemo1.controller;

import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.UserMapper;
import com.zinc.authoritydemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

//    @Autowired
//    UserMapper userMapper;

    //查找-------------------
    @GetMapping("/findall")
    public List<UserEntity> findAll() {

        return userService.findAll();
    }

    @GetMapping("/find/{name}")
    public List<UserEntity> findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    //删除-----------------------
    //强制删除
    @GetMapping("/delete")
    public Integer forceDelete(@PathVariable String name){
        return userService.forceDelete(name);
    }
    //假删
    @GetMapping("/tempDelete")
    public Integer tempDelete(@PathVariable String name){
        return userService.tempDelete(name);
    }

    //修改----------------
    //修改用户名
    @GetMapping("/updateUserName/{name}/{nameUpdate}")
    public Integer updateUserName(@PathVariable String name,@PathVariable String nameUpate){
        return userService.updateUserName(name,nameUpate);
    }
    //修改密码
    @GetMapping("/updatePassword/{name}/{newPassword}")
    public Integer updatePassword(@PathVariable String name,@PathVariable String newPassword){
        return userService.updatePassword(name,newPassword);
    }
    //修改邮箱
    @GetMapping("updateEmail/{name}/{newEmail}")
    public Integer updatePassword(@PathVariable String name,@PathVariable String newEmail){
        return userService.updateEmail(name,newEmail);
    }
    //增加员工-------------

}
