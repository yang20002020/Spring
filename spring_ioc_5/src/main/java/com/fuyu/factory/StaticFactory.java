package com.fuyu.factory;

import com.fuyu.dao.UserDao;
import com.fuyu.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        System.out.println("使用工厂静态方法实例化...");
        return new UserDaoImpl();
    }
}
