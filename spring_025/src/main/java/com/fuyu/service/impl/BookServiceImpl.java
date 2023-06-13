package com.fuyu.service.impl;
import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();
    }
}
