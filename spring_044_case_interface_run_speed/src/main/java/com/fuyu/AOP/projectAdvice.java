package com.fuyu.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class projectAdvice {

    //匹配业务层的所有方法
    @Pointcut("execution( * com.fuyu.service.*Service.*(..)))")
    private  void servicePt(){}

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        //获取执行签名信息
        Signature signature = pjp.getSignature();
        //通过签名获取执行类型
        String className = signature.getDeclaringTypeName();
        //通过签名获取执行操作名称(方法名)
        String methodName = signature.getName();


        long start = System.currentTimeMillis();
        for(int i=0; i<10000;i++){
              pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层接口万次执行时间: "+className +"."+ methodName+" "+(end-start)+"ms");
    }

}
