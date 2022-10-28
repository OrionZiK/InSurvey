package com.zinc.permissionroot3.service;

import com.zinc.permissionroot3.entity.User;

import java.util.List;

/**
 * @author OrionZinc
 * @date 2022/10/26 14:11
 */
public interface UserService {
    /**
     * 查询全部数据
     * @param
     * @return List<User>
     */
    List<User> findAll();
}
