package com.fuyu.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.fuyu.service")
@Import({jdbcConfig.class})
public class SpringConfig {
}
