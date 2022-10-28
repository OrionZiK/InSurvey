package com.zinc.permissionroot3.dao;

import com.zinc.permissionroot3.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
/**
 * @author OrionZinc
 * @date 2022/10/26 14:06
 */
public interface UserDao {
    /**
     * 全部查询
     *
     * @return 返回全部对象
     */
    public List<User> findAll();
}
