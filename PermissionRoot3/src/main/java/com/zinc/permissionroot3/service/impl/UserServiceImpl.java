package com.zinc.permissionroot3.service.impl;

import com.zinc.permissionroot3.dao.UserDao;
import com.zinc.permissionroot3.entity.User;
import com.zinc.permissionroot3.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author OrionZinc
 * @date 2022/10/26 14:11
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    /**
     * 查询全部
     * @return List
     */
    @Override
    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }
}
