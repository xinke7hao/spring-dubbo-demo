package com.mgteam.learn.dubbo.stock.provider;

import com.mgteam.learn.dubbo.stock.StockService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.util.Random;

@Slf4j
@Service(version = "1.0.0")
public class StockServiceImpl implements StockService {

    private static Random rand = new Random();

    @Override
    public int incr(int pid, int cnt) {
        log.info("client[{}] -- stock incr: {}-{}", RpcContext.getContext().getRemoteAddress(), pid, cnt);
        return cnt * rand.nextInt(10);
    }

}
