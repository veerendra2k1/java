package com.brainbitz.exercises;

public class Student {

	private int id;
	private String name;
	private long phoneNubmber;

	public Student() {

	}
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}

	

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

	public long getPhoneNubmber() {
		return phoneNubmber;
	}

	public void setPhoneNubmber(long phoneNubmber) {
		this.phoneNubmber = phoneNubmber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNubmber=" + phoneNubmber + "]";
	}

}
