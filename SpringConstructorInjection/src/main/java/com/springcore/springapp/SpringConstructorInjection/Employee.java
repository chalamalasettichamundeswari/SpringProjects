package com.springcore.springapp.SpringConstructorInjection;

public class Employee {
	private int id;
	private Address address;
	private String name;
   
	public Employee(int id, Address address, String name) {
		this.id = id;
		this.address = address;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
