package com.brainbitz.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlRead {

	public static void main(String[] args) throws IOException {
	
		URL url=new URL("http://63.142.252.27/api/server");
		URLConnection urlnew=url.openConnection();
		InputStream is=urlnew.getInputStream();
		
		boolean i;
		while((i=is.read()!=-1))
		{
			System.out.println((boolean)i);
		}
		
		

	}

}
