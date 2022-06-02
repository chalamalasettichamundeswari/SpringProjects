package com.springcore.springapp.jdbc.SpringJdbcAssignment.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springapp.jdbc.SpringJdbcAssignment.Passenger;
import com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAO.PassengerDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/springapp/jdbc/SpringJdbcAssignment/Test/config.xml");
     PassengerDAO passdao = (PassengerDAO)ac.getBean("passengerdaoimpl");
     Passenger pass = new Passenger();
     pass.setId(1);
     pass.setFirstName("chamundeswari");
     pass.setLastname("setti");
   //  int res=passdao.create(pass);
     //int res=passdao.update(pass);
    // int res=passdao.delete(1);
     Passenger res= passdao.read(10);
     System.out.println("records inserted are :"+res);
	}

}
