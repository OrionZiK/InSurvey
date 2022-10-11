package com.zinc.authoritydemo1.service;

import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionMapper permissionMapper;
    public List<PermissionEntity> findAllPermission(){
        List<PermissionEntity> list = permissionMapper.findAll();
        return list;
    }
}
