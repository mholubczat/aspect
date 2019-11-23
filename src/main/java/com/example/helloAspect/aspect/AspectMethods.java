package com.example.helloAspect.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
    public class AspectMethods {

    @After("execution(public String getName())")
    public void getNameAdvice() {
            System.out.println("After Advice");
        }

    @Before("execution(* com.example.services.*.get*())")
    public void getAllAdvice() {
        System.out.println("Before Advice");
    }

    @Pointcut("execution(* setName(*))")
    public void setNamePointcut() {
    }

    @After("setNamePointcut()")
    public void setNamePointcut(JoinPoint joinPoint) {
        System.out.println("New name");
    }

    @Around("execution(* Employee.throwException())")
    public void employeeExceptionAdvice(ProceedingJoinPoint proceedingJoinPoint) {
    
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        

    }
}
