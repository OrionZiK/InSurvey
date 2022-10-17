package com.zinc.authoritydemo1.mapper;


import com.zinc.authoritydemo1.entity.PermissionEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<PermissionEntity> findAll();

    PermissionEntity findPermissionById(@Param(value="id") Integer id);

    void addPermission(@Param(value="permission") PermissionEntity permissionEntity);

    Integer tempDelete(@Param(value="id") Integer id);

    Integer forceDelete(@Param(value="id") Integer id);

    Integer updateInformation(@Param(value="id") Integer id,@Param(value="newInformaion") String newInformaion);


}
