package com.brainbitz.controlstatements;

import java.time.LocalDate;
import java.time.Month;

public class Second {

	public void ifElseCondition() {
		int a = 2;
		int b = 3;
		if (a < b) {
			System.out.println("a is smaaller than b");
		} else {
			System.out.println("a is grater than b");
		}
	}
	
	public void weather(){
		int myMonth=LocalDate.now().getMonthValue();
		Month month =LocalDate.now().getMonth();
		String season;
		if (myMonth==12 ||myMonth==1 ||myMonth==2)
			season="Winter";
		else if (myMonth==3 || myMonth==4 || myMonth==5)
			season="Spring";
		else if (myMonth==6 || myMonth==7 || myMonth==8)
			season="Summer";
		else
			season="Bogus Month";
		System.out.println("this is "+month+".");
		System.out.println("And this month is in " +season+".");
			
		
	}

	public static void main(String[] args) {
		Second second=new Second();
				second.weather();
		
		int myMonth = LocalDate.now().getDayOfMonth();
		if (12 == LocalDate.now().getMonthValue()) {
			System.out.println("this is december");
		}

	}

}
