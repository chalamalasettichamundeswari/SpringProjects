package com.springcore.springapp.SpringORM.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springapp.SpringORM.dao.PassengerDao;
import com.springcore.springapp.SpringORM.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/springcore/springapp/SpringORM/Main/config.xml");
		PassengerDao pdao = (PassengerDao)ac.getBean("PassengerdaoImpl");
		Passenger pass = new Passenger();
		pass.setId(105);
		pass.setFirstName("chamundesh");
		pass.setLastName("setti");
		//pdao.create(pass);
		//pdao.update(pass);
		pdao.delete(pass);
       // System.out.println(pdao.find(2));
		System.out.println(pdao.findAll());
	}

}
