package com.fuyu.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.fuyu")
@PropertySource("jdbc.properties")
public class SpringConfig {
}
