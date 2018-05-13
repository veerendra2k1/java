package com.brainbitz.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.Base64;

//import org.apache.commons.codec.binary.Base64;
public class ConnectToUsingBasicAuthentication {

			public static void main(String[] args) {

	try{	
		
	//	String name = "director@gmaxmart.com";
		String name = "gmaxpvtltd@gmail.com";
		String password = "asdf";
		String authString = name + ":" + password;
		System.out.print("auth string:" + authString);
		
		String authStringEnc = Base64.getEncoder().encodeToString((authString).getBytes("utf-8"));
		
			
		System.out.println("\nBase64 encoded auth string:" + authStringEnc);
			
			
//		URL url = new URL("http://63.142.252.27/api/users");
		URL url = new URL("http://50.63.14.114:8082/api/drivers");
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestProperty("Authorization", "Basic : " + authStringEnc);
		
	//	conn.setRequestProperty("Accept","application/json");
	//	conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestMethod("GET");		
		conn.connect();
		
		//to read data
		int responsecode = conn.getResponseCode();
		
		if(responsecode != 200){
			throw new RuntimeException ("HttpResponseCode:" +responsecode);
		}
		else{
			
			System.out.println("Hurray code is 200");
			
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);

			int numCharsRead;
			char[] charArray = new char[1024];
			StringBuffer sb = new StringBuffer();
			while ((numCharsRead = isr.read(charArray)) > 0) {
				sb.append(charArray, 0, numCharsRead);
			}
			String result = sb.toString();

			System.out.println("*** BEGIN ***");
			System.out.println(result);
			System.out.println("*** END ***");
			
		}}	catch(MalformedURLException e){
			e.printStackTrace();
			
		}	catch (IOException e){
			e.printStackTrace();
		}	
	
}}