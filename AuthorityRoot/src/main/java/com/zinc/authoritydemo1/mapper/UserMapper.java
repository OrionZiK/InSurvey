package com.zinc.authoritydemo1.mapper;

import com.zinc.authoritydemo1.entity.PermissionEntity;
import com.zinc.authoritydemo1.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface UserMapper {

    public List<UserEntity> findAll();

    public List<UserEntity> findByName();

    public List<UserEntity> update();

}
