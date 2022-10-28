package com.zinc.permissionroot3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zinc.permissionroot3.dao")
public class PermissionRoot3Application {

    public static void main(String[] args) {
        SpringApplication.run(PermissionRoot3Application.class, args);
    }

}
