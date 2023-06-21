package com.fuyu.AOP;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//定义通知类，制作通知
@Component
@Aspect
public class MyAdvice {

    //定义切入点

    @Pointcut("execution(int com.fuyu.dao.BookDao.select())")  //接口
    private void pt2(){}

    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
