package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save.......");
    }

}
