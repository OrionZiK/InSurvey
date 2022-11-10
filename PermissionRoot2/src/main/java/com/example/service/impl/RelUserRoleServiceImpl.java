package com.example.service.impl;

import com.example.entity.RelUserRole;
import com.example.dao.RelUserRoleDao;
import com.example.entity.User;
import com.example.service.RelUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RelUserRole)表服务实现类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
@Service("relUserRoleService")
public class RelUserRoleServiceImpl implements RelUserRoleService {
    @Resource
    private RelUserRoleDao relUserRoleDao;

    /**
     * 新增数据
     *
     * @param id 用户主键
     * @return List
     */
    @Override
    public List<Integer> findAllByUserId(Integer id) {
        return this.relUserRoleDao.findAllByUserId(id);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RelUserRole queryById(Integer id) {
        return this.relUserRoleDao.queryById(id);
    }


    /**
     * 为用户新增角色
     *
     * @param userId 用户主键
     * @param roleId 角色主键
     * @return 是否成功
     */
    @Override
    public Boolean insertByRoleId(Integer userId, Integer roleId) {
        RelUserRole relUserRole = null;
        relUserRole.setUserId(userId);
        relUserRole.setRoleId(roleId);


        return this.relUserRoleDao.insertByRoleId(relUserRole) > 0;
    }

    /**
     * 修改数据
     *
     * @param relUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public RelUserRole update(RelUserRole relUserRole) {
        this.relUserRoleDao.update(relUserRole);
        return this.queryById(relUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 用户主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.relUserRoleDao.deleteById(userId) > 0;
    }
}
