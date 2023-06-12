package com.fuyu.service.impl;
import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();

    }

}
