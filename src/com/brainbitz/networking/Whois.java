package com.brainbitz.networking;

//Demonstrate Sockets.
import java.net.*;
import java.io.*;

class Whois {
	public static void main(String args[]) throws Exception {
		int c;
		// Create a socket connected to internic.net, port 43.
		Socket s = new Socket("whois.internic.net", 43);
		
		// Obtain input and output streams.
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		// Construct a request string.
		String str = (args.length == 0 ? "gmaxgps.com" : args[0]) + "\n";
		
		//String str = "gmaxgps.com";
				
		// Convert to bytes.
		byte buf[] = str.getBytes();
		
		// Send request.
		out.write(buf);
		
		// Read and display response.
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		s.close();
	}
}