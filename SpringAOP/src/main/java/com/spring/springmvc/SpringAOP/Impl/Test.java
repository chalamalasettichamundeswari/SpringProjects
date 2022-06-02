package com.spring.springmvc.SpringAOP.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springmvc.SpringAOP.Interface.ProductService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/springmvc/SpringAOP/Impl/config.xml");
     ProductService ps =(ProductService)ac.getBean("productserviceimpl");
     System.out.println("res is "+ps.multiply(5, 9));
	}

}
