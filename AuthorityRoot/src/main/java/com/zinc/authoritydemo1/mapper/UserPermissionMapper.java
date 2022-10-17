package com.zinc.authoritydemo1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserPermissionMapper {

    public List<Integer> findById(@Param(value = "id") Integer id);


    void addPermission(@Param(value = "userId") int userId, @Param(value ="permissionId") int permissionId);

    Integer delPermission(@Param(value = "userId") int userId, @Param(value ="permissionId") int permissionId);

    Integer tempDelPermission(@Param(value = "userId") int userId, @Param(value ="permissionId") int permissionId);
}
