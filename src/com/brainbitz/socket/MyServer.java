package com.brainbitz.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[] args) {
	
	try{
		
		System.out.println("Server is started listening port 1234");
	
	ServerSocket ss = new ServerSocket(1234);	
	Socket s = ss.accept();	
	
	
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String msgin="";
	String msgout="";
	
	while(!msgin.equals("end")){
		
		msgin = din.readUTF();
		System.out.println(msgin);
		
		msgout= br.readLine();
		dout.writeUTF(msgout);
		dout.flush();	
	
	}
	
	s.close();
	ss.close();
	
	}catch(Exception e){
		
		
	}
}
	
	

}
