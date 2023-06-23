package com.fuyu.service.impl;
import com.fuyu.dao.AccountDao;
import com.fuyu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfer(String out,String in ,Double money) throws IOException {
        accountDao.outMoney(out,money);
         if(true){throw  new IOException();};
        accountDao.inMoney(in,money);
    }

}
