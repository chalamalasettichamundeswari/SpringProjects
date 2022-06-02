package com.springcore.springapp.SpringUseProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/SpringUseProperties/config.xml");
	  MyDAO dao = (MyDAO)ac.getBean("dao");
	  System.out.println(dao);
	}
}
