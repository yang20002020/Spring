package com.fuyu.service.impl;
import com.fuyu.dao.BookDao;
import com.fuyu.dao.UserDao;
import com.fuyu.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao1, UserDao userDao1) {
        this.bookDao = bookDao1;
        this.userDao = userDao1;
    }

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();
        userDao.save();

    }

}
