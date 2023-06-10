package com.fuyu.service.impl;

import com.fuyu.dao.BookDao;
import com.fuyu.dao.impl.BookDaoImpl;
import com.fuyu.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao=new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();
    }
}
