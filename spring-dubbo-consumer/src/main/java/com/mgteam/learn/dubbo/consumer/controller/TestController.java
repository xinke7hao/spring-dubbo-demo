package com.mgteam.learn.dubbo.consumer.controller;

import com.mgteam.learn.dubbo.stock.StockService;
import com.mgteam.learn.dubbo.user.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyanbo
 * @date 2020/6/9
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Reference(version = "1.0.0")
    private StockService stockService;

    @GetMapping("/test")
    public String test(
            @RequestParam("uid") int uid,
            @RequestParam("pid") int pid,
            @RequestParam("cnt") int cnt) {
        int score = stockService.incr(pid, cnt);
        userService.addScore(uid, score);
        return "test ok";
    }
}
