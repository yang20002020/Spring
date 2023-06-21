package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public int select() {
        System.out.println("book dao select is  running.....");
        int i=10/0;
        return 100;
    }

    @Override
    public void update() {
        System.out.println("book dao update is  running......");
    }
}
