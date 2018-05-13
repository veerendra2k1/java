package com.brainbitz.inheritance;


import java.util.ArrayList;
import java.util.List;

public class Student {

	List<String> courseList = new ArrayList<>();

	public Student() {

	}

	public void addCourse(String course) {
		courseList.add(course);
	}

	@Override
	public String toString() {
		return "Student [courseList=" + courseList + "]";
	}
	
}