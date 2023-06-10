package com.fuyu.service.impl;

import com.fuyu.dao.UserDao;
import com.fuyu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSeviceImpl implements UserService {

    @Override
    public void save() {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) app.getBean("userDao1");
        userDao.save();
    }
}
