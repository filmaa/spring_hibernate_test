package com.example.demo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    SessionFactory sessionFactory;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
}
