package com.example.service;

import com.example.entity.RelUserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (RelUserRole)表服务接口
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
public interface RelUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RelUserRole queryById(Integer id);

    /**
     * 分页查询
     *
     * @param relUserRole 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<RelUserRole> queryByPage(RelUserRole relUserRole, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param relUserRole 实例对象
     * @return 实例对象
     */
    RelUserRole insert(RelUserRole relUserRole);

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
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
