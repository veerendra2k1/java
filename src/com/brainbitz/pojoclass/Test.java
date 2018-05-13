package com.brainbitz.pojoclass;

public class Test {

	public static void main(String[] args) {

		
		Student student = new Student();
		
	//	Student veerendra =new Student(2,"john");
		
		student.setId(1);
		student.setName("john");
		student.setPhoneNubmber(546874875);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getPhoneNubmber());
	//	System.out.println(veerendra);
	}

}
