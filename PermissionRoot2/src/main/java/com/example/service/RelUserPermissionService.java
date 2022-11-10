package com.example.service;

import com.example.entity.RelUserPermission;
import com.example.entity.User;

import java.util.List;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (RelUserPermission)表服务接口
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
public interface RelUserPermissionService {

    /**
     * 根据用户ID查询全部权限
     * @param id 用户id
     * @return List<User>
     */
    List<Integer> findAllByUserId(Integer id);
    /**
     * 通过主键查询
     * Params: id 用户主键
     */
    RelUserPermission queryById(Integer id);

    /**
     * 新增数据
     *
     * @param relUserPermission 实例对象
     * @return 实例对象
     */
    RelUserPermission insert(RelUserPermission relUserPermission);

    /**
     * 修改数据
     *
     * @param relUserPermission 实例对象
     * @return 实例对象
     */
    RelUserPermission update(RelUserPermission relUserPermission);

    /**
     * 通过主键删除数据
     *
     * @param userId 用户主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}
