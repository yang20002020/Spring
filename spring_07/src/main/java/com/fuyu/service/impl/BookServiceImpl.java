package com.fuyu.service.impl;
import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println(" BookServiceImpl setBookDao ......");
    }

    @Override
    public void save() {
        System.out.println("book service save 。。。。。。");
        bookDao.save();
    }
    //接口 DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy......");
    }
    //接口 InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" book service afterPropertiesSet   init .......");
    }
}
