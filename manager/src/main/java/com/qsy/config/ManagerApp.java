package com.qsy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @created jiangxj
 * @date 2018-05-09
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.qsy")
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class);
    }

}
