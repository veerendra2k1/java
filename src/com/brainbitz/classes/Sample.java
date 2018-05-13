package com.brainbitz.classes;

public class Sample {

	int myAge = 33;
	String aaaa = "my frined";
	
	public Sample() {
		System.out.println("This is sample constructor");
		Testing obj1 = new Testing();
		obj1.addTwo();
		System.out.println(obj1.hashCode());
		System.out.println(obj1.equals(obj1));
		int totalAge = myAge+obj1.age;
		System.out.println(totalAge);
	}
	
	public void myNewMessage(String aaaa){
		String hello = aaaa;
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Sample sample = new Sample();
		sample.myNewMessage("john");
	}

}
