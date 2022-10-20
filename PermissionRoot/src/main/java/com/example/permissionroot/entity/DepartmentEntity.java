package com.example.permissionroot.entity;

import java.util.Date;

/**
 * @author OrionZinc
 * @date 2022/10/19 10:36
 */
public class DepartmentEntity {
    private int id;
    private String departmentName;
    private Date createName;
    private Date updateName;
    private int delFlag;

    public DepartmentEntity(int id, String departmentName, Date createName, Date updateName, int delFlag) {
        this.id = id;
        this.departmentName = departmentName;
        this.createName = createName;
        this.updateName = updateName;
        this.delFlag = delFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getCreateName() {
        return createName;
    }

    public void setCreateName(Date createName) {
        this.createName = createName;
    }

    public Date getUpdateName() {
        return updateName;
    }

    public void setUpdateName(Date updateName) {
        this.updateName = updateName;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }
}
