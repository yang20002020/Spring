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
        //设置关闭钩子  虚拟机关闭之前，先关闭容器Ioc
        ((ClassPathXmlApplicationContext)app).registerShutdownHook();
        UserDao userDao1=(UserDao) app.getBean("userDao");
        System.out.println(userDao1);


    }
}