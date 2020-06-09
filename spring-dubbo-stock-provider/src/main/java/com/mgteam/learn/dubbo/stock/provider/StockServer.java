package com.mgteam.learn.dubbo.stock.provider;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


@EnableAutoConfiguration
public class StockServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StockServer.class)
                .run(args);
    }
}