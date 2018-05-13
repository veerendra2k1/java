package com.brainbitz.inheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1. ADD FullTime student 2. ADD PartTime student 3.EXIT");
			int userinput = scanner.nextInt();

			switch (userinput) {
			case 1: {
				FullTimeStudent fullTimeStudent = new FullTimeStudent();
				System.out.println("Do you want to add a course - if yes press y/n");
				String a = scanner.next();
				
				if(a.equals("y")){
					if(fullTimeStudent.status){
						
					}
				}
				
			}
				break;
			case 2: {
				PartTimeStudent partTimeStudent = new PartTimeStudent();
			}
				break;
			case 3: {
				System.exit(0);
			}
				break;
			default: {

			}
			}

		}
	}

}