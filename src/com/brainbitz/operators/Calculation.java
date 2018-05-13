package com.brainbitz.operators;

import java.util.Scanner;

public class Calculation {

	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();

	public Calculation() {
		System.out.println("This is con---");
	}

	public int add() {
		int addition = a + b;
		return addition;
	}

	public int sub() {
		int substraction = a - b;
		return substraction;
	}

	public int mul() {
		int multiplication = a * b;
		return multiplication;
	}

	public float div() {
		float division = a / b;
		return division;
	}

	public static void result() {
		System.out.println("This is static---");

		Calculation calculation = new Calculation();
		System.out.println(calculation.add());
		System.out.println(calculation.sub());
		System.out.println(calculation.mul());
		System.out.println(calculation.div());
	}

	public static void main(String[] args) {

		new Calculation();
		result();

	}

}
