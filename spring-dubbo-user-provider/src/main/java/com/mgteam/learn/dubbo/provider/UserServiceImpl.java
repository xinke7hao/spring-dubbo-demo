package com.mgteam.learn.dubbo.provider;

import com.mgteam.learn.dubbo.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Slf4j
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String addScore(int uid, int score) {
        log.info("client[{}] -- user add score: {}-{}", RpcContext.getContext().getRemoteAddress(), uid, score);
        return "ok";
    }

}
