package com.sskj.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

@EnableScheduling
@SpringBootApplication
public class Application {
    private static ConfigurableApplicationContext content;

    public static void main(String[] args) {
        Application.content = SpringApplication.run(Application.class,args);
    }

    @PreDestroy
    public void close(){
        Application.content.close();
    }
}
