package com.mgteam.learn.dubbo.provider;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


@EnableAutoConfiguration
public class UserServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServer.class)
                .run(args);
    }
}