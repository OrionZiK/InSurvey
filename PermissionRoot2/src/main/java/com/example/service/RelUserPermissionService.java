package com.example.service;

import com.example.entity.RelUserPermission;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * (RelUserPermission)表服务接口
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
public interface RelUserPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RelUserPermission queryById(Integer id);

//    /**
//     * 分页查询
//     *
//     * @param relUserPermission 筛选条件
//     * @param pageRequest       分页对象
//     * @return 查询结果
//     */
//    Page<RelUserPermission> queryByPage(RelUserPermission relUserPermission, PageRequest pageRequest);

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
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
