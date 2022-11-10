package com.example.service;

import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;


/**
 * (User)表服务接口
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
public interface UserService {
    /**
     * 查询全部数据
     * @param
     * @return List<User>
     */
    List<User> findAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<User> queryByPage(User user, PageRequest pageRequest);
    /**
     * 通过用户名模糊查询
     *
     * @param name 用户名
     * @return List 实例对象
     */
    List<User> queryLikelyByName(String name);
    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


}
