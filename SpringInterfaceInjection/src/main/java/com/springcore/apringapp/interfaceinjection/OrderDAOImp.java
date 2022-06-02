package com.springcore.apringapp.interfaceinjection;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImp implements OrderDAO {
	@Override 
	public void createOrder() {
		// TODO Auto-generated method stub
		 System.out.println("Inside OrderImp DAO createOrder");
	} 

}
