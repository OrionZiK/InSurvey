package com.zinc.authoritydemo1.service;


import com.zinc.authoritydemo1.entity.UserEntity;
import com.zinc.authoritydemo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service

//@Configurable
//@Component
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public List<UserEntity> findAll() {
        List<UserEntity> list1 = userMapper.findAll();
        return list1;
    }

    public List<UserEntity> findByName() {
        List<UserEntity> list2 = userMapper.findByName();
        return list2;
    }

    public Integer save(UserEntity entity) {
        if (entity.getId() == null){  //如果id为空，则为新增
            return userMapper.save(entity);
        }else{                        //id不为空则是更新
            return userMapper.update(entity);
        }
    }




    public Integer DELETE(Integer id){

        return userMapper.DELETE(id);
    }
}
