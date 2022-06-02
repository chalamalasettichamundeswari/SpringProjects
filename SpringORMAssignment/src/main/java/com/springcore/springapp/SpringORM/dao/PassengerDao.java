package com.springcore.springapp.SpringORM.dao;

import java.util.List;

import com.springcore.springapp.SpringORM.entity.Passenger;

public interface PassengerDao {
 int create(Passenger pass);
 void update(Passenger pass);
 void delete(Passenger pass);
 Passenger find(int id);
 List<Passenger>findAll();
}
