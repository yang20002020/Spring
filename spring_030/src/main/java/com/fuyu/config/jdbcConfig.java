package com.fuyu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;


public class jdbcConfig {
    //1.定义一个方法获得要管理的对象
    //2.添加@bean,表示当前方法的返回值是一个bean
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/web05");
        ds.setUsername("root");
        ds.setPassword("fendou2017");
        return ds;
    }

}
