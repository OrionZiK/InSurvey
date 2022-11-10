package com.example.service;

import com.example.entity.Role;
import com.example.entity.User;

import java.util.List;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (Role)表服务接口
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
public interface RoleService {

    /**
     * 查询全部数据
     * @param
     * @return List<User>
     */
    List<Role> findAll();

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
