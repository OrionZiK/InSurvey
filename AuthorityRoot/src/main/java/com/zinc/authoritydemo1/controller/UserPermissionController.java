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

    /**根据id查询该用户拥有的权限*/
    @GetMapping("findById/{userId}")
    public List<Integer> findById(Integer userId){
        return userPermissionService.findById(userId);
    }

    /**根据权限id及id增加用户该权限*/
    @GetMapping("addPermission/[userId,permissionId]")
    public Integer addPermission(int userId,int permissionId){
        return userPermissionService.addPermission(userId,permissionId);
    }
    /**根据权限id及id删除用户该权限*/
    @GetMapping("delPermission/[userId,permissionId]")
    public Integer delPermission(int userId,int permissionId){
        return userPermissionService.delPermission(userId,permissionId);
    }
    /**根据权限id及id临时删除用户该权限*/
    @GetMapping("tempDelPermission/[userId,permissionId]")
    public Integer tempDelPermission(int userId,int permissionId){
        return userPermissionService.tempDelPermission(userId,permissionId);
    }
}
