package com.example.service.impl;

import com.example.entity.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.Date;

import static org.aspectj.bridge.Version.getTime;


/**
 * (User)表服务实现类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 查询全部
     * @return List
     */
    @Override
    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<User> queryByPage(User user, PageRequest pageRequest) {
        long total = this.userDao.count(user);
        return new PageImpl<>(this.userDao.queryAllByLimit(user, pageRequest), pageRequest, total);
    }

    /**
     * 通过用户名模糊查询
     *
     * @param name 用户名
     * @return List 实例对象
     */
    @Override
    public List<User> queryLikelyByName(String name) {
        return this.userDao.queryLikelyByName(name);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        //user.setCreateTime(getTimeStamp());
        this.userDao.insert(user);

        return user;

    }


    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        System.out.println("id="+id);
        return this.userDao.deleteById(id) > 0;
    }
}
