package com.springcore.springapp.SpringCollectionTypeSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/springapp/SpringCollectionTypeSetterInjection/config.xml");
        Hospital hospital=(Hospital)ac.getBean("hospital");
		System.out.println("Name of Patient : "+hospital.getName()+" List of departments : "+hospital.getDoctors());
	}

}