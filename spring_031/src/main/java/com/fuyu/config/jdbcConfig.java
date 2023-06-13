package com.fuyu.config;
import com.alibaba.druid.pool.DruidDataSource;
import com.fuyu.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
public class jdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private  String driver;
    @Value("jdbc:mysql://localhost:3306/web05")
    private  String url;
    @Value("root")
    private  String username;
    @Value("fendou2017")
    private  String password;

    //1.定义一个方法获得要管理的对象
    //2.添加@bean,表示当前方法的返回值是一个bean
    @Bean
    public DataSource dataSource(BookService bookService){
        System.out.println(bookService);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

}
