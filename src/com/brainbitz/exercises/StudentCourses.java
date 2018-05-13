package com.brainbitz.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentCourses {

	public static void main(String[] args) {
		// declaring variables
		Scanner scanner = new Scanner(System.in);
		String studentName;
		String fullTimeCourse1, fullTimeCourse2, fullTimeCourse3, fullTimeCourse4;
		String partTimeCourse1, partTimeCourse2, partTimeCourse3;

		// declaring arraylist
		ArrayList<String> fullTimeCourse = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		Set<String> h = new HashSet<String>();
		
		ArrayList<String> partTimecourse = new ArrayList<>();
		ArrayList<String> courseList = new ArrayList<>();

		// adding data into course list
		courseList.add("PHP");
		courseList.add("ASP .NET");
		courseList.add("C");
		courseList.add("C++");
		courseList.add("C#");
		courseList.add("MySQL");
		courseList.add("Android Studio");
		courseList.add("Cloud Computing");
		courseList.add("Ruby");
		courseList.add("Python");

		// first statement on screen
		System.out.println("Welcome to BrianBitz. Please Enter your Name:");

		// reading student name and storing in variable
		studentName = scanner.nextLine();

		// asking student job status
		System.out.println("do u have any job " + studentName + "?");
		System.out.println("if yes press  y , or press n");

		String s = scanner.next();
		boolean status;
		if (s.equals("y")) {
			status = true;
		} else {
			status = false;
		}

		// printing job status
		System.out.println(status);

		// offering courses to student
		System.out.println("welcome " + studentName);
		System.out.println("We have two types of courses \n 1-Full Time \n 2-Part Time");

		// asking choice for course type
		System.out.println("Enter your choice");

		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println(studentName + " We offer ten courses for you");

			// Printing courses list
			for (String temp : courseList) {
				System.out.println(temp);
			}

			System.out
					.println("Please enter Course name and Press Enter key (maximum 4 courses and minimum 3 courses)");

			// while(){
			// fullTimeCourse1 = scanner.nextLine();
			// fullTimeCourse.add(fullTimeCourse1);
			// }

			// start adding course selected by student
			System.out.println("Enter here");
			boolean flag = true;
			while (flag) {
				String course = scanner.nextLine();
				fullTimeCourse.add(course);
				if (fullTimeCourse.size() == 3) {
					flag = false;
				}

			}

			/*
			 * fullTimeCourse1 = scanner.nextLine();
			 * fullTimeCourse.add(fullTimeCourse1);
			 * 
			 * // start adding second course fullTimeCourse2 =
			 * scanner.nextLine(); fullTimeCourse.add(fullTimeCourse2);
			 * 
			 * // start adding third course fullTimeCourse3 =
			 * scanner.nextLine();
			 * //fullTimeCourse.contains(partTimeCourse3)?fullTimeCourse.add(
			 * fullTimeCourse3) : fullTimeCourse3 = scanner.nextLine();
			 * fullTimeCourse.add(fullTimeCourse3);
			 * 
			 * //start adding fourth course fullTimeCourse4 =
			 * scanner.nextLine(); fullTimeCourse.add(fullTimeCourse4);
			 */

			System.out.println(fullTimeCourse);

		}

	}

}
