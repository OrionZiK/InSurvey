package com.zinc.authoritydemo1.controller;


import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    PermissionService permissionService;

    /**查询已有权限*/
    @GetMapping("allPermission")
    public List<PermissionEntity> findAllPermission(){
        return permissionService.findAllPermission();
    }
    /**根据id查找权限信息*/
    @GetMapping("PermissionById/{id}")
    public PermissionEntity findPermissionById(int id){
        return permissionService.findPermissionById(id);
    }
    /**增加权限*/
    @GetMapping("AddPermission/[permissionName,information]")
    public Integer addPermission(String permissionName,String information){
        return permissionService.addPermission(permissionName,information);
    }
    /**假删权限*/
    @GetMapping("tempDelete/{id}")
    public Integer tempDelete(Integer id){
        return permissionService.tempDelete(id);
    }
    /**真删权限*/
    @GetMapping("forceDelete/{id}")
    public Integer forceDelete(Integer id){
        return permissionService.forceDelete(id);
    }

    /**根据id修改权限信息*/
    @GetMapping("updateInformation/[id,newInfo]")
    public Integer updateInformation(int id,String newInfo){
        return permissionService.updateInformation(id,newInfo);
    }
}
