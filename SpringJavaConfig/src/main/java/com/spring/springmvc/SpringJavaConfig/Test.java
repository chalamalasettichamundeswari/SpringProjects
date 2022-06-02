package com.spring.springmvc.SpringJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Service dao=ac.getBean(Service.class);
        Service dao1=ac.getBean(Service.class);
        System.out.println(dao.hashCode()+"    "+dao1.hashCode());
        dao.save();
        ac.close();
	}

}
