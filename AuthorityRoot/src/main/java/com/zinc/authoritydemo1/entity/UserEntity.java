package com.zinc.authoritydemo1.entity;

import lombok.Data;

import java.util.Date;
@Data
public class UserEntity {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Integer state; // 状态 0/禁止 1/正常
    private Date createTime;
    private Date updateTime;
}
