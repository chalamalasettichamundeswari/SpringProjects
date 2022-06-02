package com.springcore.springapp.SpringCoreAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/springapp/SpringCoreAssignment/config.xml");
     ShoppingCart sc = (ShoppingCart)ac.getBean("shoppingCart");
     System.out.println(sc.getItem());
	}

}
