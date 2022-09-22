package com.zinc.authoritydemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zinc.authoritydemo1.mapper")
public class AuthorityDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(AuthorityDemo1Application.class, args);
    }

}
