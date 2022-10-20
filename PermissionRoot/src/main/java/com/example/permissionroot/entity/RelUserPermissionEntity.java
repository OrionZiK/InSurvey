package com.example.permissionroot.entity;

import java.sql.Timestamp;

/**
 * @author OrionZinc
 * @date 2022/10/19 10:56
 */
public class RelUserPermissionEntity {
    int id;
    int userId;
    int permissionId;
    int delFlag;
    Timestamp createTime;
    Timestamp updateTime;
}
