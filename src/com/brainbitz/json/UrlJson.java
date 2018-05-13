/**
 * 
 */
package com.brainbitz.json;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author ADMIN
 *
 */
public class UrlJson {

	private static String inline;

	/**
	 * @param args
	 * @return 
	 * @throws Throwable 
	 */
	
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Step No-1 pass the url as a object
				URL url = new URL("http://185.183.182.115/api/server");
				
				//step -2 type cast URL object into HttpURLConnection to get properties of 
				//HttpURLConeection Class		
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				
				//step-3 set the request type for the API
				conn.setRequestMethod("GET");
				
				//Step - 4 open a connection
				conn.connect();
				
				//step - 5 get the corresponding response code
				int responsecode = conn.getResponseCode();
				
				//step- 6 perform check that Response code is not 200 we throw a exception throw
				if (responsecode !=200){
					throw new RuntimeException ("HttpResponseCode:" +responsecode);
				}
				else
				{
					System.out.println("Hurrey we get  " +responsecode);
					
					Scanner sc = new Scanner(url.openStream());
					while(sc.hasNext())
					{
					inline+=sc.nextLine();
					}
				//	System.out.println(“\nJSON data in string format”);
					System.out.println(inline);
					sc.close();
					
				}					
				

	}
		
		
	}