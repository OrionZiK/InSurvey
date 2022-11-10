package com.example.service;

import com.example.entity.RelUserRole;
import com.example.entity.User;

import java.util.List;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (RelUserRole)表服务接口
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
public interface RelUserRoleService {

    /**
     * 根据ID查询全部角色
     * @param id 用户主键
     * @return List<User>
     */
    List<Integer> findAllByUserId(Integer id);

    RelUserRole queryById(Integer id);

    /**
     * 为用户新增角色
     *
     * @param userId 用户主键 roleId 角色主键
     *
     * @return 是否成功
     */
    Boolean insertByRoleId(Integer userId,Integer roleId);

    /**
     * 修改数据
     *
     * @param relUserRole 实例对象
     * @return 实例对象
     */
    RelUserRole update(RelUserRole relUserRole);

    /**
     * 通过主键删除数据
     *
     * @param userId 用户主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}
