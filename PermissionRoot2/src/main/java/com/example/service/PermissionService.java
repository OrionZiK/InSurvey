package com.example.service;

import com.example.entity.Permission;
import com.example.entity.User;
import com.gitee.hengboy.mybatis.pageable.Page;

import java.util.List;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (Permission)表服务接口
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
public interface PermissionService {

    Permission queryById(Integer id);

    /**
     * 查询全部数据
     * @param
     * @return List<User>
     */
    List<Permission> findAll();
    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission insert(Permission permission);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission update(Permission permission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
