package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private  String dataBaseName;
    private  int connectionNum;
    @Override
    public void save() {
        System.out.println("book dao save.......");
    }
}
