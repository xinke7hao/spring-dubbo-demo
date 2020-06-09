package com.mgteam.learn.dubbo.stock;

public interface StockService {

    /**
     * 库存服务 - 扣减库存
     * @param pid
     * @param cnt
     * @return
     */
    int incr(int pid, int cnt);

}