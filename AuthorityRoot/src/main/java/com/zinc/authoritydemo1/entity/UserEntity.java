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

    public UserEntity() {
    }

    public UserEntity(Long id, String username, String password, String email, Integer state, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
