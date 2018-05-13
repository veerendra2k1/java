package com.brainbitz.arrays;

import java.util.Scanner;

public class ArraysSample {

	public static void main(String[] args) {

		/*int[] marks = { 23, 45, 23, 5, 46, 325, 45, 76 };

		for (int i = 0; i < 8; i++) {
			System.out.println(marks[i]);
		}*/
		int[] score =  new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			score[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		scanner.close();
	}

}
