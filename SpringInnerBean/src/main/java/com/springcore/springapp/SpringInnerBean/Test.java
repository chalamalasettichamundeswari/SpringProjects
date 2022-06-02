package com.springcore.springapp.SpringInnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/SpringInnerBean/config.xml");
		 Employee emp= (Employee)ac.getBean("emp");
		 System.out.println(emp.hashCode());
		 Employee emp1= (Employee)ac.getBean("emp");
		 System.out.println(emp1.hashCode());
	}

}
