package com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAO;

import com.springcore.springapp.jdbc.SpringJdbcAssignment.Passenger;

public interface PassengerDAO {
  int create(Passenger pass); 
  int update(Passenger pass);
  int delete(int id);
  Passenger read(int id);
}
