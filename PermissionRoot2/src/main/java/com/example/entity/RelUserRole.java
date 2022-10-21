package com.example.entity;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (RelUserRole)实体类
 *
 * @author makejava
 * @since 2022-10-21 16:58:32
 */
public class RelUserRole implements Serializable {
    private static final long serialVersionUID = 216018939684644532L;
    /**
     * 关系id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 0代表未删除
     */
    private Integer delFlag;
    /**
     * 创建信息时间
     */
    private Timestamp createTime;
    /**
     * 更新信息时间
     */
    private Timestamp updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

}

