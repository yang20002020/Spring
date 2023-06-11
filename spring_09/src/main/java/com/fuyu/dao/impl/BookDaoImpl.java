package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private  String dataBaseName;


    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save......."+dataBaseName  +" ,"+connectionNum);
    }
}
