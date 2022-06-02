package com.springcore.springapp.SpringReferenceSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/SpringReferenceSetterInjection/config.xml");
	  Student stuscore = (Student)ac.getBean("student");
	  System.out.println(stuscore.getScores());
	}

}
