package com.springcore.springapp.SpringCollectionTypeSetterInjection;

import java.util.*;

public class Hospital {
	private String name;
	//private List<String> departments ;
	//private Set<String> departments ;
	private Map<Integer,String> doctors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<String> getDepartments() {
//		return departments;
//	}
//
//	public void setDepartments(Set<String> departments) {
//		this.departments = departments;
//	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", doctors=" + doctors + "]";
	}

	public Map<Integer,String> getDoctors() {
		return doctors;
	}

	public void setDoctors(Map<Integer,String> doctors) {
		this.doctors = doctors;
	}

}

