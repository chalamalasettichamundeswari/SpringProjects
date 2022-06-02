package com.springcore.springapp.Instructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/springapp/Instructor/config.xml");
      Instructor ins = (Instructor)ac.getBean("inst");
	  System.out.println(ins);
	  
	  Instructor ins1 = (Instructor)ac.getBean("inst");
	  System.out.println(ins1);

//		Instructor ins = (Instructor) ac.getBean("inst");
//     	System.out.println(ins);
	}

}
