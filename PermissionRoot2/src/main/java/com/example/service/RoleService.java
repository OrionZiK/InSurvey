package com.example.service;

import com.example.entity.Role;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (Role)表服务接口
 *
 * @author makejava
 * @since 2022-10-21 16:58:33
 */
public interface RoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param role        筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    Page<Role> queryByPage(Role role, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role insert(Role role);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
