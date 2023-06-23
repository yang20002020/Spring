package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;


    public void transfer(String out,String in ,Double money) {

        try{
            accountDao.outMoney(out,money);
            int i=10/0;
            accountDao.inMoney(in,money);
        }finally {
            //该行代码必定运行
            logService.log(out,in,money);
        }

    }

}
