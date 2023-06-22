package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id,String password) {
        System.out.println("findName 函数"+"id:"+id+ " " +"password:"+password);

        return "itcast";
    }
}
