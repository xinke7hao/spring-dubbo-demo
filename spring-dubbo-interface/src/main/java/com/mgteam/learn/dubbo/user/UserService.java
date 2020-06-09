package com.mgteam.learn.dubbo.user;

public interface UserService {

    /**
     * 用户服务 - 添加用户积分
     * @param uid
     * @param score
     * @return
     */
    String addScore(int uid, int score);

}