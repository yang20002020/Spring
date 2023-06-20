package com.fuyu.AOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//定义通知类，制作通知
@Component
@Aspect
public class MyAdvice {

    //定义切入点
    @Pointcut("execution(void com.fuyu.dao.BookDao.update())")
    private void pt(){}

    //绑定切入点与通知关系
    @Before("pt()")
    public void before(){
        System.out.println(System.currentTimeMillis());
    }

}
