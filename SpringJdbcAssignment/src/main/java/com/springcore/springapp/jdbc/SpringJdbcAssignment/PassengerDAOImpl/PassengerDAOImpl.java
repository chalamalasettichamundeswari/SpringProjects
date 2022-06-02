package com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAOImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springapp.jdbc.SpringJdbcAssignment.Passenger;
import com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAO.PassengerDAO;
import com.springcore.springapp.jdbc.SpringJdbcAssignment.PassengerDAO.PassengerRowMapper;

public class PassengerDAOImpl implements PassengerDAO{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int create(Passenger pass) {
		String sql="insert into Passenger values(?,?,?)";
		int res = jdbcTemplate.update(sql, pass.getId(),pass.getFirstName(),pass.getLastname());
		return res;
	}

	public int update(Passenger pass) {
		String sql="update Passenger set firstName=? where id=?";
		int res = jdbcTemplate.update(sql,pass.getFirstName(),pass.getId());
		return res;
	}

	public int delete(int id) {
		String sql="delete from  Passenger where id=?";
		int res = jdbcTemplate.update(sql,id);
		return res;
	}

	public Passenger read(int id) {
		String sql="select * from  Passenger where id=?";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
		
	}

}
