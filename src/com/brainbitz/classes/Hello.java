package com.brainbitz.classes;

import java.util.Scanner;

class Hello {

	public static void main(String[] args) {
		Brain brain = new Brain();
		System.out.println(brain.status());
		System.out.println(brain.myAge);
		
		Scanner scanner = new Scanner(System.in);
		int myValue1 = scanner.nextInt();
		int myValue2 = scanner.nextInt();	
		
		
		String aa = scanner.next();
		String bb = scanner.nextLine();
		
		
		System.out.println(myValue1);
		System.out.println(myValue2);
		System.out.println(aa);
		System.out.println(bb);
		scanner.close();
		
	}

}
