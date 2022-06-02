package com.spring.springmvc.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("loginaspect")
public class LoginAspect {
 @Before("execution(* com.spring.springmvc.SpringAOP.Impl.ProductServiceImpl.multiply(..))")
 public void logBefore(JoinPoint joinpoint) {
	 System.out.println("Before calling the method");
 }
 @After("execution(* com.spring.springmvc.SpringAOP.Impl.ProductServiceImpl.multiply(..))")
 public void logAfter(JoinPoint joinpoint) {
	 System.out.println("After the method invocation.");
 }
}
