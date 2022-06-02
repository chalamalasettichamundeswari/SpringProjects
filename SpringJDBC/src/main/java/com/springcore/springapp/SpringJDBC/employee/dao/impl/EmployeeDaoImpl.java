package com.springcore.springapp.SpringJDBC.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springcore.springapp.SpringJDBC.employee.dao.EmployeeDao;
import com.springcore.springapp.SpringJDBC.employee.dao.rowmapper.EmployeeRowMapper;
import com.springcore.springapp.SpringJDBC.employee.dto.Employee;
@Component("empdaoimp")
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee employee) {
		 String sql = "insert into employee values(?,?,?)";
		 int result = jdbcTemplate.update(sql, employee.getId(),employee.getFirstname(),employee.getSalary());;
		 return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int update(Employee employee) {
		 String sql = "update employee set name=?,salary=? where id=?";
		 int result = jdbcTemplate.update(sql, employee.getFirstname(),employee.getSalary(),employee.getId());
		 return result;
	}
	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,id);
		return 0;
	}
	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
	@Override
	public List<Employee> read() {
		String sql = "select * from employee ";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		return jdbcTemplate.query(sql, rowMapper);
		
	}
 
}
