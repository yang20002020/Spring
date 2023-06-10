package com.fuyu.Demo;

import com.fuyu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
客户端代码
 */
public class UserDaoDemo {
    public static void main(String[] args){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1=(UserDao) app.getBean("userDao1");
        System.out.println(userDao1);
    }
}