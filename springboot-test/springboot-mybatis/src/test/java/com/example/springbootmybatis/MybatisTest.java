package com.example.springbootmybatis;


import com.example.springbootmybatis.domain.user;
import com.example.springbootmybatis.mapper.UserMapper;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SpringbootMybatisApplication.class)
@RunWith(SpringRunner.class)
public class MybatisTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void findAllTest(){
        List<user> userList = userMapper.findAll();
        System.out.println(userList);
    }

}
