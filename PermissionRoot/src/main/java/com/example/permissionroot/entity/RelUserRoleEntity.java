package com.example.permissionroot.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author OrionZinc
 * @date 2022/10/19 10:55
 */
public class RelUserRoleEntity {
    int id;
    int userId;
    int roleId;
    int delFlag;
    Timestamp createTime;
    Timestamp updateTime;


}
