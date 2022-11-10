package com.example.service.impl;

import com.example.entity.RelUserPermission;
import com.example.dao.RelUserPermissionDao;
import com.example.entity.User;
import com.example.service.RelUserPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RelUserPermission)表服务实现类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
@Service("relUserPermissionService")
public class RelUserPermissionServiceImpl implements RelUserPermissionService {
    @Resource
    private RelUserPermissionDao relUserPermissionDao;

    /**
     * 通过用户ID查询所有权限
     *
     * @param userId 用户主键
     * @return list 权限主键列表
     */
    @Override
    public List<Integer> findAllByUserId(Integer userId) {
        return this.relUserPermissionDao.findAllByUserId(userId);
    }
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RelUserPermission queryById(Integer id) {
        return this.relUserPermissionDao.queryById(id);
    }
    /**
     * 新增数据
     *
     * @param relUserPermission 实例对象
     * @return 实例对象
     */
    @Override
    public RelUserPermission insert(RelUserPermission relUserPermission) {
        this.relUserPermissionDao.insert(relUserPermission);
        return relUserPermission;
    }
    /**
     * 修改数据
     *
     * @param relUserPermission 实例对象
     * @return 实例对象
     */
    @Override
    public RelUserPermission update(RelUserPermission relUserPermission) {
        this.relUserPermissionDao.update(relUserPermission);
        return this.queryById(relUserPermission.getId());
    }
    /**
     * 通过主键删除数据
     *
     * @param userId 用户主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.relUserPermissionDao.deleteById(userId) > 0;
    }
}
