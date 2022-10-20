package com.example.permissionroot.entity;

import java.sql.Timestamp;

/**
 * @author OrionZinc
 * @date 2022/10/19 10:45
 */
public class PermissionEntity {
    int id;
    String permissionName;
    Timestamp createTime;
    Timestamp updateTime;
    int delFlag;
}
