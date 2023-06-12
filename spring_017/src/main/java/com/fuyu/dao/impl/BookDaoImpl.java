package com.fuyu.dao.impl;
import com.fuyu.dao.BookDao;
import java.util.*;

public class BookDaoImpl implements BookDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dao save......."+name);


    }
}
