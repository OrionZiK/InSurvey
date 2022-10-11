package com.zinc.authoritydemo1.controller;

import com.zinc.authoritydemo1.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userPermission")
public class UserPermissionController {
    @Autowired
    UserPermissionService userPermissionService;

//    //根据id查询权限
//    @GetMapping("findById/{userId}")
//    public List<Integer> findById(Integer userId){
//        return UserPermissionService.findById(userId);
//    }
//
//    //根据权限名称及id增加用户该权限
//    @GetMapping("addPermission/{userId}/{permissionId}")
//    public Integer addPermission(int userId,int permissionId){
//        return UserPermissionService.addPermission(userId,permissionId);
//    }
//    //根据权限名称及id删除用户该权限
//    @GetMapping("delPermission/{userId}/{permissionId}")
//    public Integer delPermission(int userId,int permissionId){
//        return UserPermissionService.delPermission(userId,permissionId);
//    }
}
