package com.brainbitz.classes;

public class Testing {

	byte age = 21;
	short lanNuber = 23545;
	int a = 25;
	int b = 5;
	long mobile = 976644664;
	float c = 3.14f;
	char firstLetter = 'j';
	double aa = 356546.4354646;
	boolean status = true;
	String name = "brain";

	public Testing() {
		System.out.println("This is constructor");
		addTwo();
	}

	public void addTwo() {
		int c = a + b;
		System.out.println(c);
	}
}