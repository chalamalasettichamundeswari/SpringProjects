package com.springcore.springapp.SpringORM.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.springapp.SpringORM.dao.PassengerDao;
import com.springcore.springapp.SpringORM.entity.Passenger;


public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	HibernateTemplate hiberTemp;
	@Transactional
	public int create(Passenger pass) {
		return (Integer) hiberTemp.save(pass);
	}
	@Override
	@Transactional
	public void update(Passenger pass) {
		hiberTemp.update(pass);
		
	}
	@Override
	@Transactional
	public void delete(Passenger pass) {
		// TODO Auto-generated method stub
		 hiberTemp.delete(pass);
	}
	@Override
	@Transactional
	public Passenger find(int id) {
		return hiberTemp.get(Passenger.class,id);
	}
	@Override
	@Transactional
	public List<Passenger> findAll() {
		// TODO Auto-generated method stub
		return hiberTemp.loadAll(Passenger.class);
	}
	
	
	

}
