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

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        //表示对原始操作的调用
        Object proceed = pjp.proceed();
        System.out.println("around after advice ...");
        return  2001;
    }

    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
