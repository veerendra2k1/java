package com.brainbitz.controlstatements;

import java.util.Scanner;

public class Primes {
	
	public void FindPrime(){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		boolean isPrime=true;
		for (int i=2; i<= num/i; i++){
			if (( num%i)==0){
				isPrime= false;
				break;
			}
		}
		
		if (isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Primes primes=new Primes();
primes.FindPrime();

	}

}
