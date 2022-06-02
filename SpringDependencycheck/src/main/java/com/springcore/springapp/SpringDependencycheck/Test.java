package com.springcore.springapp.SpringDependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springapp.SpringDependencycheck.Prescription;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/SpringDependencycheck/config.xml");
		 Prescription pres = (Prescription)ac.getBean("prescription");
		  System.out.println(pres);
		 
	}

}
