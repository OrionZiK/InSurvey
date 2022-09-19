package com.zinc.authoritydemo1.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PermissionEntity {
    private Long id;
    private String name;
    private String description;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}
