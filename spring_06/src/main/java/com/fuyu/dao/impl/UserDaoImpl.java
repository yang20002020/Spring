package com.fuyu.dao.impl;

import com.fuyu.dao.UserDao;

public class UserDaoImpl implements UserDao {
    //重写无参构造
    public UserDaoImpl(){
        System.out.println("创建构造函数.....");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init.....");
    }
    //表示bean销毁之前对应的操作
    public void destory(){
        System.out.println("destory.....");
    }
    @Override
    public void save() {
        System.out.println("save running......");
    }
}
