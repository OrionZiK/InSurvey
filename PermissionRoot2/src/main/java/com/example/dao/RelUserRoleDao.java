package com.example.dao;

import com.example.entity.RelUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (RelUserRole)表数据库访问层
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
@Mapper
public interface RelUserRoleDao {
    /**
     * 全部查询
     * @Params id 主键
     * @return 返回该用户权限对应主键
     */
    List<Integer> findAllByUserId(@Param("userId") Integer userId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RelUserRole queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param relUserRole 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<RelUserRole> queryAllByLimit(RelUserRole relUserRole, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param relUserRole 查询条件
     * @return 总行数
     */
    long count(RelUserRole relUserRole);

    /**
     * 为用户新增角色
     *
     * @param relUserRole 实例对象
     * @return 影响行数
     */
    int insertByRoleId(RelUserRole relUserRole);

    /**
     * 修改数据
     *
     * @param relUserRole 实例对象
     * @return 影响行数
     */
    int update(RelUserRole relUserRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@Param("userId") Integer userId);

}

