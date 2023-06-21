package com.fuyu.AOP;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//定义通知类，制作通知
@Component
@Aspect
public class MyAdvice {

    //定义切入点
    @Pointcut("execution(void com.fuyu.dao.BookDao.update())")  //接口
    private void pt(){}


    @Around("pt()")
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
