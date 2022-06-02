package com.springcore.springapp.SpringCollectionPropertiesSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/springapp/SpringCollectionPropertiesSetterInjection/config.xml");
		CountriesAndLanguages countryAndLangs=(CountriesAndLanguages)ac.getBean("CountriesAndLang");
		System.out.println(countryAndLangs);
	}

}
