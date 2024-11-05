package com.codelevate.crudhexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.codelevate.crudhexagonal")
public class CrudHexagonalApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudHexagonalApplication.class, args);
    }
}