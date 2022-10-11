package com.zinc.authoritydemo1.mapper;

import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper

public interface UserMapper {

    public List<UserEntity> findAll();
    /**查询所有用户*/
    public List<UserEntity> findByName(@Param(value="name") String name);
    /**通过姓名查询*/
    public Integer insertFull(@Param());
    public void deleteByName(String name);
    /**通过名子删除*/
    public Integer updateByName(@Param(value="name") String name,@Param(value="newName") String newName);

    public Integer updatePassword(@Param(value="name") String name,@Param(value="newPassword") String newPassword);
}
