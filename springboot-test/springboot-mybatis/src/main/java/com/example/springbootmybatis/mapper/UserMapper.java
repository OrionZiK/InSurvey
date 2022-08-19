package com.example.springbootmybatis.mapper;


import com.example.springbootmybatis.domain.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    public List<user> findAll();

}
