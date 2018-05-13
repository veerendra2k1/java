package com.brainbitz.fileexample;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Testing {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Address address = new Address("pothanicald", 686671);
		Address address2 = new Address("muvattupuzha", 686661);
		Employee employee = new Employee(12, "john", address);
		Employee employee2 = new Employee(23, "swapna", address2);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);

		FileOutputStream outputStreamFile = new FileOutputStream("employee.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream outputStreamObject = new ObjectOutputStream(outputStreamFile);
		outputStreamObject.writeObject(list);
		
		FileWriter fw = new FileWriter("employee2.txt");
		fw.write(list.toString());
		fw.close();

		FileInputStream fileInputStream = new FileInputStream("employee.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		List<Object> newList = (List) inputStream.readObject();
		//System.out.println(newList);
		newList.forEach(System.out::println);
	}
}
