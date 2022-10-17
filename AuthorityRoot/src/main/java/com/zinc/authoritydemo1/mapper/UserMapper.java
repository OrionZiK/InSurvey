package com.zinc.authoritydemo1.mapper;

import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Mapper

public interface UserMapper {

    public List<UserEntity> findAll();
    /**查询所有用户*/
    public List<UserEntity> findByName(@Param(value="name") String name);
    /**通过姓名查询*/
    //通过参数传参
//    public Integer insertFull(@Param(value="name") String username,
//                              @Param(value="password") String password,
//                              @Param(value="email") String email,
//                              @Param(value="state") Integer state,
//                              @Param(value="createTime") Date createTime,
//                              @Param(value="updateTime") Date updateTime);
    /**通过List传参*/
    public void insertFull(@Param(value="user") UserEntity user);

    public void deleteByName(String name);
    /**通过名子删除*/
    public void updateByName(@Param(value="name") String name,@Param(value="newName") String newName);

    public void updatePassword(@Param(value="name") String name,@Param(value="newPassword") String newPassword);

    public void updateEmail(@Param(value="name") String name,@Param(value="newEmail") String newEmail);
}
