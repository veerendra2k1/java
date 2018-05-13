package com.brainbitz.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		
		try {
			System.out.println("Please Enter Server IP adress:");
			Scanner scanner = new Scanner(System.in);
			String IP = scanner.nextLine();
			
			
			// My IP is 10.86.215.207
			
			Socket s = new Socket (IP,1234);
			System.out.println("You are now connected to the server");
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String msgin="";
			String msgout="";
			
			while(!msgin.equals("end")){
				
				msgout = br.readLine();
				dout.writeUTF(msgout);
				
				msgin = din.readUTF();
				System.out.println(msgin);
				
			}		
			
			
			s.close();
			scanner.close();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You are now disconnected to the server");

}
}
