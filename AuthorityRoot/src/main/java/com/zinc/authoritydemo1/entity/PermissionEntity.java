package com.zinc.authoritydemo1.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PermissionEntity {
    private Long id;
    private String name;
    private String information;
    private Integer state;
    private Date createTime;
    private Date updateTime;

    public PermissionEntity(Long id, String name, String information, Integer state, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
