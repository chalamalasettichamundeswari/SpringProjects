package com.springcore.springapp.SpringPrimitiveTypeSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/springapp/SpringPrimitiveTypeSetterInjection/config.xml");
			// ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/springapp/SpringPrimitiveTypeSetterInjection/config.xml");
			Employee emp= (Employee)ctx.getBean("emp");
			System.out.println("Employee Id : "+emp.getId()+" Employee Name : "+emp.getName());
			ctx.registerShutdownHook();
			}
}
