package com.communitystart.communitystart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.communitystart.communitystart.mapper")
public class CommunitystartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunitystartApplication.class, args);
    }

}
