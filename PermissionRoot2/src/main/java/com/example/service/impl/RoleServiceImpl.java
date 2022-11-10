package com.example.service.impl;

import com.example.entity.Role;
import com.example.dao.RoleDao;
import com.example.entity.User;
import com.example.service.RoleService;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;

    /**
     * 查询全部
     * @return List
     */
    @Override
    public List<Role> findAll() {
        List<Role> list = roleDao.findAll();
        return list;
    }


    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role insert(Role role) {
        this.roleDao.insert(role);
        return role;
    }

    @Override
    public Role update(Role role) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleDao.deleteById(id) > 0;
    }
}
