package com.springcore.springapp.SpringJDBC.employeetest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springapp.SpringJDBC.employee.dao.EmployeeDao;
import com.springcore.springapp.SpringJDBC.employee.dao.impl.EmployeeDaoImpl;
import com.springcore.springapp.SpringJDBC.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/springapp/SpringJDBC/employeetest/config.xml");
       // EmployeeDao dao =(EmployeeDao)ac.getBean("employeedao");
        EmployeeDao dao =(EmployeeDao)ac.getBean("empdaoimp");
        Employee emp = new Employee();
        emp.setId(1);
        emp.setFirstname("durgasetti");
        emp.setSalary(90000);
       // int result=dao.create(emp);
       // int result=dao.update(emp);
        //int result=dao.delete(10);
        
	   // System.out.println("No of records :"+dao.read(102));
        System.out.println("No of records :"+dao.read());
	}

}
