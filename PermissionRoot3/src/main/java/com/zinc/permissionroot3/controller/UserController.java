package com.zinc.permissionroot3.controller;

import com.zinc.permissionroot3.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
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
    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<User>> queryByPage(User user, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userService.queryByPage(user, pageRequest));
    }

}