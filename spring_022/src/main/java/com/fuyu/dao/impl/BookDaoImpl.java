package com.fuyu.dao.impl;

import com.fuyu.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
//@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save.......");
    }
    @PostConstruct
    public void init(){
        System.out.println("init......");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy.....");
    }
}
