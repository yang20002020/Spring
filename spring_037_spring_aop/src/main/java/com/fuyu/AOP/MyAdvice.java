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
    //1.
   // @Pointcut("execution(void com.fuyu.dao.BookDao.update())")  //接口
    //2.
   // @Pointcut("execution(* com.fuyu.dao.BookDao.update())")
    //3.
    // @Pointcut("execution(* com.*.*.*.update())")
    //4.  实现类
   // @Pointcut("execution(* com.fuyu.dao.impl.BookDaoImpl.update())")
    //5.
   // @Pointcut("execution(* com.*.*.*.*.update())")
    //6.
    //@Pointcut("execution(void  *..update())")
    //7.
   // @Pointcut("execution(*  *..*(..))")
    //8.
    @Pointcut("execution(* com.*.*.*.*.u*())")
    private void pt(){}

    //绑定切入点与通知关系
    @Before("pt()")
    public void before(){
        System.out.println(System.currentTimeMillis());
    }

}
