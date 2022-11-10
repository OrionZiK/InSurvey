package com.example.entity;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:32
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 746967558557426199L;
    /**
     * 权限id
     */
    private Integer id;
    /**
     * 权限名称
     */
    private String permissionName;
    /**
     * 创建信息时间
     */
    private Timestamp createTime;
    /**
     * 更新信息时间
     */
    private Timestamp updateTime;
    /**
     * 0代表未删除
     */
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
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

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

