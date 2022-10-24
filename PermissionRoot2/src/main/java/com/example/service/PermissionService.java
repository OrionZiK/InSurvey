package com.example.service;

import com.example.entity.Permission;
import com.gitee.hengboy.mybatis.pageable.Page;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (Permission)表服务接口
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
public interface PermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Permission queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param permission  筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    Page<Permission> queryByPage(Permission permission, PageRequest pageRequest);

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
