package com.boss.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

    @Pointcut("execution(* com.boss.spring.service.*.*(..))")
    public void PointCut(){

    }
    @Before("PointCut()")
    public void before(){

    }
}
