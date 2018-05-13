package com.brainbitz.exercises;

import java.security.AllPermission;
import java.util.Scanner;

public class Courses {
	String instituteName = "BrainBitz";
	public String course1 = "1-PHP";
	String course2 = "2-ASP.NET";
	String course3 = "3-Android Studio";
	public String course4 = "4-C";
	String course5 = "5-C++";
	String course6 = "6-C#";
	String course7 = "7-Java";
	String course8 = "8-Python";
	String course9 = "9-ruby";
	String course10 = "10-Mysql";

	public void allCoursesList() {
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println(course4);
		System.out.println(course5);
		System.out.println(course6);
		System.out.println(course7);
		System.out.println(course8);
		System.out.println(course9);
		System.out.println(course10);
	}

	public void welcome() {
		System.out.println("Welcome to BrianBitz. Please Enter your Name:");

		Scanner scanner = new Scanner(System.in);
		String studentName = scanner.nextLine();
		System.out.println("do u have any job ?");
		System.out.println("if yes press  y , or press n");
		String s = scanner.next();
		boolean status;
		if (s.equals("y")) {
			status = true;
		} else {
			status = false;
		}
		System.out.println(status);

		System.out.println("welcome " + studentName);
		System.out.println("We have two types of courses \n 1-Full Time \n 2-Part Time");
		System.out.println("Enter your choice");
		System.out.println();

		Scanner scanner1 = new Scanner(System.in);
		int choice = scanner1.nextInt();
	
		if (choice == 1) {
			System.out.println(studentName + " We offer ten courses for you");
			allCoursesList();
			System.out.println("Please enter Course number and Press Enter key (maximum 4 courses and minimum 3 courses)");
			Scanner scanner2 = new Scanner(System.in);
			int fullTimeCourse1 = scanner2.nextInt();
			int fulltimecourse2 = scanner2.nextInt();			
			int fullTimeCourse3 = scanner2.nextInt();
			System.out.println("Do you want to select another course yes/no");
			String response = new Scanner(System.in).nextLine().trim();
			System.out.println("Please enter 4th course number");
			
			if (response.equalsIgnoreCase("yes")) {
				int fulltimecourse4 = scanner2.nextInt();
				System.out.println("Thankyou " + studentName + " You have selected four courses");
			} else {
				System.out.println("Thankyou " + studentName + " You have selected three courses");
			}
			
		} else {
			System.out.println(" We offer ten courses you");
			allCoursesList();
			System.out.println("Please enter Course number and Press Enter key (maximum 2 courses and minimum 1 course)");
			Scanner scanner3 = new Scanner(System.in);
			int partTimeCourse1 = scanner3.nextInt();
			System.out.println("Do you want to select another course yes/no");
			String response1 = new Scanner(System.in).nextLine().trim();

			if (response1.equalsIgnoreCase("yes")) {
				System.out.println("Please enter 2nd course number");
				int parttimecourse2 = scanner3.nextInt();
				System.out.println("Thankyou " + studentName + " You have selected Two courses");
			} else {
				System.out.println("Thankyou " + studentName + " You have selected One courses");
			}
			
			scanner3.close();
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Courses course = new Courses();
		course.welcome();

	}

}