package com.brainbitz.arrays;

import java.util.Scanner;

public class ArrayCheckInputValue {

	public static void main(String[] args) {
		int marks[] = { 23, 45, 23, 5, 46, 325, 45, 76 };		
			
		System.out.println("Enter some number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i=0;i<8;i++){
			if (marks[i]==num){
				System.out.println("Your enterd number " +num+ " is present in our data");
			}
			
			}
		scanner.close();
		
		}
		
	}