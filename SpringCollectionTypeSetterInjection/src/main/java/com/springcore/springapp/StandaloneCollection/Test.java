package com.springcore.springapp.StandaloneCollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/springapp/StandaloneCollection/config.xml");
        Hospital hospital=(Hospital)ac.getBean("hospital");
		System.out.println(hospital);
	}

}
