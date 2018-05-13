package com.brainbitz.networking;

//Demonstrate HttpURLConnection.
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HttpURLDemo {
	public static void main(String args[]) throws Exception {
		//URL hp = new URL("http://www.google.com");
		URL hp = new URL("http://www.gmaxgps.com");
		
		HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
		
		// Display request method.
		System.out.println("Request method is " + hpCon.getRequestMethod());
		
		// Display response code.
		System.out.println("Response code is " + hpCon.getResponseCode());
		
		// Display response message.
		System.out.println("Response Message is " + hpCon.getResponseMessage());
		
		// Get a list of the header fields and a set
		// of the header keys.
		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		System.out.println("\nHere is the header:");
		
		// Display all header keys and values.
		for (String k : hdrField) {
			System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
		}
	}
}