package com.zinc.authoritydemo1.service;

import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    public List<PermissionEntity> findAllPermission(){
        List<PermissionEntity> list = permissionMapper.findAll();
        return list;
    }
    boolean existById(Integer Id){
        return true;
    }
    boolean existByName(String name){
        return true;
    }

    public PermissionEntity findPermissionById(Integer id){
        PermissionEntity permission = permissionMapper.findPermissionById(id);
        return permission;

    }
    /**新增权限*/
    public Integer addPermission(String name, String information){
        Date createTime = new Date();
        Date updateTime = new Date();
        PermissionEntity newPermission = new PermissionEntity(null,name,information,1,createTime,updateTime);
        permissionMapper.addPermission(newPermission);
        if(existByName(name)) {
            return 2;
            /**重复*/
        }else{
            return 1;
        }
    }


    /**临时删除*/
    public Integer tempDelete(Integer id){
        if (existById(id)){
            permissionMapper.tempDelete(id);
            return 1;
        }else{
            return 0;
        }
    }

    /**强制删除*/
    public Integer forceDelete(Integer id){
        if (existById(id)){
            permissionMapper.forceDelete(id);
            return 1;
        }else{
            return 0;
        }
    }

    public Integer updateInformation(Integer id, String information){
        if (existById(id)){
            permissionMapper.updateInformation(id,information);
            return 1;
        }else{
            return 0;
        }
    }

}
