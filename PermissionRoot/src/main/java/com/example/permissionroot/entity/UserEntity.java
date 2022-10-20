package com.example.permissionroot.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author OrionZinc
 * @date 2022/10/19 10:15
 */
public class UserEntity {
    int id;
    String name;
    String phone;
    Timestamp createTime;
    String password;
    int delFlag;
    int attemptTimes;
    Timestamp attemptTime;
    int lockedStatus;
    String username;
    Timestamp updateTime;
    int departmentId;

}
