package com.brainbitz.fileexample;


import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private transient  Integer age;
	private String name;
	private Address address;

	public Employee() {

	}

	public Employee(Integer age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee  : age=" + age + ", name=" + name + ", " + address + "";
	}
}
