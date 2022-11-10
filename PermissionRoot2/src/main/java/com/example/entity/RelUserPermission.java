package com.example.entity;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (RelUserPermission)实体类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
public class RelUserPermission implements Serializable {
    private static final long serialVersionUID = -24307598280810210L;
    /**
     * 关系id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 权限id
     */
    private Integer permissionId;
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

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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

