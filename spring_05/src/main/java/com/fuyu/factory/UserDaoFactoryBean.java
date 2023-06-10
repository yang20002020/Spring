package com.fuyu.factory;
import com.fuyu.dao.UserDao;
import com.fuyu.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法: 代替了类DynamicFactory中的方法getUserDao
    @Override
    public UserDao getObject() throws Exception {
        System.out.println("UserDaoFactoryBean  getObject");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
