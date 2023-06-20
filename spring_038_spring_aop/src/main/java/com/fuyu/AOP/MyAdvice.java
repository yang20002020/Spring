package com.fuyu.AOP;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//定义通知类，制作通知
@Component
@Aspect
public class MyAdvice {

    //定义切入点
    @Pointcut("execution(void com.fuyu.dao.BookDao.update())")  //接口
    private void pt(){}

    //绑定切入点与通知关系
    @Before("pt()")
    public void before(){
        System.out.println("before advice.....");
    }
    @After("pt()")
    public void after(){
        System.out.println("after advice ....");
    }

    public void around(){
        System.out.println("around before advice...");
        System.out.println("around after advice ...");
    }

    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
