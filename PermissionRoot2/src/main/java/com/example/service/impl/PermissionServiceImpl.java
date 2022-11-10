package com.example.service.impl;

import com.example.entity.Permission;
import com.example.dao.PermissionDao;
import com.example.entity.Role;
import com.example.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;
    /**
     * 查询全部
     * @return List
     */
    @Override
    public List<Permission> findAll() {
        List<Permission> list = permissionDao.findAll();
        return list;
    }
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer id) {
        return this.permissionDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission insert(Permission permission) {
        this.permissionDao.insert(permission);
        return permission;
    }

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission update(Permission permission) {
        this.permissionDao.update(permission);
        return this.queryById(permission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.permissionDao.deleteById(id) > 0;
    }
}
