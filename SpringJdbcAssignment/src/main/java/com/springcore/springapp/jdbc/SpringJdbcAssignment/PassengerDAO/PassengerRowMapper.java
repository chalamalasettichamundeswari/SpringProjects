package com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.springapp.jdbc.SpringJdbcAssignment.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Passenger pass =new Passenger();
		pass.setId(rs.getInt(1));
		pass.setFirstName(rs.getString(2));
		pass.setLastname(rs.getString(3));
		return pass;
	}
	

}
