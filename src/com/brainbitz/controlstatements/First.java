package com.brainbitz.controlstatements;

public class First {

	public void ifStatement() {

		int a = 2;
		int b = 0;

		if (a == 0) {
			System.out.println("executing");
		} else {
			System.out.println("else condition executing");
		}

		if (a == 4 || a == 2) {
			System.out.println("bitwise operater");
		}

	}

	public void whileanddowhile() {
		int a = 10;

		int b = 10;

		while (a != b) {

		}
		do {
			System.out.println("hello");
		} while (a == b);

	}

	public void increments() {
		int a = 23;
		System.out.println(a);
		System.out.println(a++);

		System.out.println(++a);
		System.out.println(a);

	}

	public void switchCondititon() {
		int a = 6;
		char aa = 'c';

		switch (aa) {
		case 'a':
			System.out.println("case 1");
			break;
		case 'c':
			System.out.println("case 2");
			break;
		case 'd':
			System.out.println("case 3");
			break;
		default:
			System.out.println("default");
		}
	}
	
	public static void main(String[] args) {

		//First first = new First();
		// first.ifStatement();
		// irst.whileanddowhile();
		// first.increments();
		//first.switchCondititon();
		//first.forloop();
	}

}
