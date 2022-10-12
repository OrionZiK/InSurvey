package com.zinc.authoritydemo1.service;


import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;


    /**查找*/
    public List<UserEntity> findAll() {
        List<UserEntity> list = userMapper.findAll();
        return list;
    }

    public List<UserEntity> findByName(String name) {
        List<UserEntity> list = userMapper.findByName(name);
        return list;

    }
    /**插入一个用户的全部信息*/
    public Integer insertFull(String username,String password,String email,Integer state){
        if(existByName(username)){
            Date createTime = new Date();
            Date updateTime = new Date();
            UserEntity insertUser = new UserEntity(null, username, password, email, state, createTime, updateTime);
            userMapper.insertFull(insertUser);
            return 1;
        }else{
            return 0;
        }
    }

    /**检查数据库中员工是否存在*/
    public Boolean existByName(String name){
        List<UserEntity> list = userMapper.findByName(name);
        if(list != null){
            return true;
            //若查找对象存在则返回1
        }else{
            return false;
            //不存在则返回0
        }
    }


    /**删除*/
    /**彻底删除该员工的所有信息*/
    public Integer forceDelete(String name){
        if(existByName(name)){
            userMapper.deleteByName(name);
            //彻底从数据库中删除该员工
            return 1;
            //删除成功
        }else{
            return 0;
            //该员工不存在
        }
    }
    //临时删除该员工
    public Integer tempDelete(String name){
        if(existByName(name)){
            userMapper.deleteByName(name);
            //彻底从数据库中删除该员工
            return 1;
            //删除成功
        }else{
            return 0;
            //该员工不存在
        }
    }

    //修改用户名
    public Integer updateUserName(String username,String newUsername){
        if(existByName(username)){
            userMapper.updateByName(username,newUsername);
            //彻底从数据库中删除该员工
            return 1;
            //修改成功
        }else{
            return 0;
            //该员工不存在
        }
    }

    // 修改密码
    public Integer updatePassword(String name,String newPassword){
        if(existByName(name)){
            userMapper.updatePassword(name,newPassword);
            //从数据库中修改
            return 1;
            //修改成功
        }else{
            return 0;
            //该员工不存在
        }
    }
    public Integer updateEmail(String name,String newEmail){
        if(existByName(name)){
            userMapper.updatePassword(name,newEmail);
            //从数据库中修改
            return 1;
            //修改成功
        }else{
            return 0;
            //该员工不存在
        }
    }
//    public Integer save(UserEntity entity) {
//        if (entity.getId() == null){  //如果id为空，则为新增
//            return userMapper.save(entity);
//        }else{                        //id不为空则是更新
//            return userMapper.update(entity);
//        }
//    }
//
//
//
//
//    public Integer DELETE(Integer id){
//
//        return userMapper.delete(id);
//    }
}
