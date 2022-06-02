package com.springcore.springapp.Instructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst") //bean name in quotes
//@Scope("prototype")
//@Component
public class Instructor {
	@Value("#{new Integer(88)}")
	//@Value("#{T(java.lang.Math).abs(-99)}")
	//@Value("#{80+9}")
	//@Value("10")
	private int id=11;
	//@Value("#{'chamundeswari'.toUpperCase()}")
	@Value("#{new String('chamundeswari')}")
	//@Value("chamundeswari")
	private String name="chamu";
	
	//@Value("#{2+4>8}")
	@Value("#{2+4>8?true:false}")
	private boolean isActive;
	
	
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", isActive=" + isActive + ", topics=" + topics
				+ ", profile=" + profile + "]";
	}

    

	
	
}
