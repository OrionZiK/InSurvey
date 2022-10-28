package com.zinc.permissionroot3.controller;

import com.zinc.permissionroot3.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zinc.permissionroot3.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author OrionZinc
 * @date 2022/10/26 14:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 单页查询全部信息
     *
     * @return 全部查询数据
     */
    @GetMapping("/findall")
    public List<User> findAll() {
        return userService.findAll();
    }
}