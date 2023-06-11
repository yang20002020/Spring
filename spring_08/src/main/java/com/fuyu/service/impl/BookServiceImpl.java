package com.fuyu.service.impl;
import com.fuyu.dao.BookDao;
import com.fuyu.dao.UserDao;
import com.fuyu.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println(" BookServiceImpl setBookDao ......");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println(" BookServiceImpl setUserDao ......");
    }

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();
        userDao.save();
    }

}
