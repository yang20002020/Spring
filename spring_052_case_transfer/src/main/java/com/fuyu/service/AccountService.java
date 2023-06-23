package com.fuyu.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

//转账接口
public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */
    //配置当前接口方法具有事务
    @Transactional(rollbackFor =IOException.class)
    public void transfer(String out,String in ,Double money) throws IOException;
}
