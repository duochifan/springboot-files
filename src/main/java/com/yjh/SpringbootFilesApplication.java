package com.yjh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yjh.dao")
public class SpringbootFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFilesApplication.class, args);
    }

}
