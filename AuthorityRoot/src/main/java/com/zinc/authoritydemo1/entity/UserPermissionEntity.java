package com.zinc.authoritydemo1.entity;

import lombok.Data;

import java.util.Date;
@Data
public class UserPermissionEntity {
    private Long id;
    private Long userId;
    private Long permissionId;
    private Long state;
    private Date createTime;
    private Date updateTime;
}
