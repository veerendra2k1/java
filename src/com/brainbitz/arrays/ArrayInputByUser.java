package com.brainbitz.arrays;


import java.util.Scanner;

public class ArrayInputByUser {

	public static void main(String[] args) {
		int[] score =  new int[8];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			score[i] = scanner.nextInt();
		}
		//System.out.println("You have entered following values");
		for (int i = 0; i < score.length; i++) {			
			System.out.println(score[i]);
		}
		scanner.close();
			
		}
}
		
	