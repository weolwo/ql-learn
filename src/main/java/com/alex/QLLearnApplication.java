package com.alex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages = "com.alex.dao")
@SpringBootApplication
@EnableTransactionManagement
public class QLLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(QLLearnApplication.class, args);
    }

}
