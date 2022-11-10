package com.example.entity;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author OrionZinc
 * @since 2022-10-21 16:58:33
 */
public class User implements Serializable {
    private static final long serialVersionUID = -89698555161119129L;

    private Integer id;

    private String name;

    private String phone;

    private Timestamp createTime;

    private String password;
    /**
     * 0代表未删除
     */
    private Integer delFlag;
    /**
     * 记录尝试次数,，尝试3次将锁定
     */
    private Integer attemptTimes;
    /**
     * 上次尝试时间
     */
    private Timestamp attemptTime;
    /**
     * 锁定标志，0为未锁定，1为锁定
     */
    private Integer lockedStatus;
    /**
     * 用户名
     */
    private String username;

    private Timestamp updateTime;
    /**
     * 部门id
     */
    private Integer deptId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getAttemptTimes() {
        return attemptTimes;
    }

    public void setAttemptTimes(Integer attemptTimes) {
        this.attemptTimes = attemptTimes;
    }

    public Timestamp getAttemptTime() {
        return attemptTime;
    }

    public void setAttemptTime(Timestamp attemptTime) {
        this.attemptTime = attemptTime;
    }

    public Integer getLockedStatus() {
        return lockedStatus;
    }

    public void setLockedStatus(Integer lockedStatus) {
        this.lockedStatus = lockedStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}

