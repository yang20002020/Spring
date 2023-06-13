package com.fuyu.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
//@ComponentScan("com.fuyu.config")
@Import({jdbcConfig.class})
public class SpringConfig {
}
