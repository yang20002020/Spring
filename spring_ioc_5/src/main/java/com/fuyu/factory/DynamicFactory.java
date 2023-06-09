package com.fuyu.factory;

import com.fuyu.dao.UserDao;
import com.fuyu.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        System.out.println("调用DynamicFactory类...");
        return new UserDaoImpl();
    }
}
