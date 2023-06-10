package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl(){
        System.out.println("BookDaoImpl无参构造....");
    }
    @Override
    public void save() {
        System.out.println("执行BookDaoImpl......");
        System.out.println("book dao save.......");
    }
}
