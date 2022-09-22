package com.zinc.authoritydemo1.service;


import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;


    //查找
    public List<UserEntity> findAll() {
        List<UserEntity> list = userMapper.findAll();
        return list;
    }

    public List<UserEntity> findByName(String name) {
        List<UserEntity> list = userMapper.findByName(name);
        return list;
    }
    //检查数据库中员工是否存在
    public Integer existByName(String name){
        List<UserEntity> list = userMapper.findByName(name);
        if(list != null){
            return 1;          //若查找对象存在则返回1
        }else{
            return 0;          //不存在则返回0
        }
    }


    //删除
    //彻底删除该员工的所有信息
    public Integer forceDelete(String name){
        if(existByName(name) == 1){
            userMapper.deleteByName(name);      //彻底从数据库中删除该员工
            return 1;                       //删除成功
        }else{
            return 0;                       //该员工不存在
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
