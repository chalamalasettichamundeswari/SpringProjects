package com.springcore.springapp.SpringCoreAdvanced.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/SpringCoreAdvanced/autowiring/annotation/config.xml");
		 Employee emp= (Employee)ac.getBean("emp");
		 System.out.println(emp);
	}

}
