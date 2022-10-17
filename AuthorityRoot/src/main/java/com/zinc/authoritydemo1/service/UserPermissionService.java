package com.zinc.authoritydemo1.service;

import com.zinc.authoritydemo1.mapper.UserPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPermissionService {
    @Autowired
    public UserPermissionMapper userPermissionMapper;

    public List<Integer> findById(Integer id){
        List<Integer> permissions = userPermissionMapper.findById(id);
        return permissions;
    }

    public Boolean existById(Integer userId,Integer permissionId){
        return true;
    }

    public Integer addPermission(int userId, int permissionId) {
        if(existById(userId,permissionId)){
            userPermissionMapper.addPermission(userId,permissionId);
            return 2;
        }else {
            userPermissionMapper.addPermission(userId,permissionId);
            return 1;
        }

    }


    public Integer delPermission(int userId, int permissionId) {
        if(existById(userId,permissionId)){
            return userPermissionMapper.delPermission(userId,permissionId);
        }else {
            return 0;
        }
    }

    public Integer tempDelPermission(int userId, int permissionId) {
        if(existById(userId,permissionId)){
            return userPermissionMapper.tempDelPermission(userId,permissionId);
        }else {
            return 0;
        }

    }
}
