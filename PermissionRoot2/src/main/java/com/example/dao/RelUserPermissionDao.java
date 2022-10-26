package com.example.dao;

import com.example.entity.RelUserPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;
@Mapper
/**
 * (RelUserPermission)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
public interface RelUserPermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RelUserPermission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param relUserPermission 查询条件
     * @param pageable          分页对象
     * @return 对象列表
     */
    List<RelUserPermission> queryAllByLimit(RelUserPermission relUserPermission, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param relUserPermission 查询条件
     * @return 总行数
     */
    long count(RelUserPermission relUserPermission);

    /**
     * 新增数据
     *
     * @param relUserPermission 实例对象
     * @return 影响行数
     */
    int insert(RelUserPermission relUserPermission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<RelUserPermission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<RelUserPermission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<RelUserPermission> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<RelUserPermission> entities);

    /**
     * 修改数据
     *
     * @param relUserPermission 实例对象
     * @return 影响行数
     */
    int update(RelUserPermission relUserPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

