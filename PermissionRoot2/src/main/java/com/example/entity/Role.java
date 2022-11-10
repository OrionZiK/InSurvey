package com.example.entity;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 597808276713305968L;

    private Integer id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 更新时间
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

