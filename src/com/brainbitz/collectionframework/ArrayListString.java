package com.brainbitz.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			String course = scanner.nextLine();
			myList.add(course);
			if (myList.size() == 4) {
				flag = false;
			}
		}

		System.out.println(myList);

		Map<String, String> x = new HashMap<String, String>();
		x.put("name", "john");
		System.out.println(x.get("name"));
		
		scanner.close();

	}

}
