package com.fuyu.dao.impl;

import com.fuyu.dao.UserDao;

public class UserDaoImpl implements UserDao {
    //重写无参构造
    public UserDaoImpl(){
        System.out.println("创建构造函数.....");
    }
    @Override
    public void save() {
        System.out.println("save running......");
    }
}
