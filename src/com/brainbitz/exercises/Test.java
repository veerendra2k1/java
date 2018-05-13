package com.brainbitz.exercises;

import com.brainbitz.exercises.Student;

public class Test {
	
	int a=10;
	int b=5;
	int phoneNumber = 341432234;
	
	public int add(){
		int addition=a+b;
		return addition;
	}
	
	public String aaa(){
		return "hello";
	}
	
	public int sub(){
		int substraction=a-b;
		return substraction;
	}
	
	public int mul(){
		int multiplication=a*b;
		return multiplication;
	}
	
	public int div(){
		int division=a/b;
		return division;
	}
	
			

	public static void main(String[] args) {		
		Test test=new Test();
		
		new Test();
		
		
		System.out.println(test.add());
		System.out.println(test.sub());
		System.out.println(test.mul());
		System.out.println(test.div());
		
		String newsss = test.aaa();
		System.out.println(newsss);
	
		Student  student = new Student();

	}

}