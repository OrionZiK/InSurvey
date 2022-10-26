package com.example.service.impl;

import com.example.entity.RelUserRole;
import com.example.dao.RelUserRoleDao;
import com.example.service.RelUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (RelUserRole)表服务实现类
 *
 * @author makejava
 * @since 2022-10-21 16:58:33
 */
@Service("relUserRoleService")
public class RelUserRoleServiceImpl implements RelUserRoleService {
    @Resource
    private RelUserRoleDao relUserRoleDao;

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
     * 新增数据
     *
     * @param relUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public RelUserRole insert(RelUserRole relUserRole) {
        this.relUserRoleDao.insert(relUserRole);
        return relUserRole;
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
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.relUserRoleDao.deleteById(id) > 0;
    }
}
