package com.brainbitz.json;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = "";
		
		try
		
		{
			
	//		String name = "director@gmaxmart.com";
			String name = "gmaxpvtltd@gmail.com";
			String password = "asdf";
			String authString = name + ":" + password;
			System.out.print("auth string:" + authString);
			
			String authStringEnc = Base64.getEncoder().encodeToString((authString).getBytes("utf-8"));
			
				
			System.out.println("\nBase64 encoded auth string:" + authStringEnc);
				
				
//			URL url = new URL("http://63.142.252.27/api/users");
			URL url = new URL("http://50.63.14.114:8082/api/drivers");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestProperty("Authorization", "Basic : " + authStringEnc);
			
		//	conn.setRequestProperty("Accept","application/json");
		//	conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestMethod("GET");		
			conn.connect();
			
			//to read data
			int responsecode = conn.getResponseCode();
			
			//Iterating condition to if response code is not 200 then throw a runtime exception
			//else continue the actual process of getting the JSON data
			if(responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " +responsecode);
			else
			{
				
				System.out.println("Hurray code is 200");
				
				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);

				int numCharsRead;
				char[] charArray = new char[1024];
				StringBuffer sb = new StringBuffer();
				while ((numCharsRead = isr.read(charArray)) > 0) {
					sb.append(charArray, 0, numCharsRead);
				}
				 result = sb.toString();

				System.out.println("*** BEGIN ***");
				System.out.println(result);
				System.out.println("*** END ***");
				
				
				
	/*			//Scanner functionality will read the JSON data from the stream
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					inline+=sc.nextLine();
				}
				System.out.println("\nJSON Response in String format"); 
				System.out.println(inline);
				//Close the stream when reading the data has been finished
				sc.close();
	*/			
			}
			
			//JSONParser reads the data from string object and break each data into key value pairs
			JSONParser jsonParser = new JSONParser();
			
			//Type caste the parsed json data in json object
	//		JSONObject jobj = (JSONObject)parse.parse(result);
			
			JSONArray jsonArr = (JSONArray)jsonParser.parse(result);
		//	JSONArray jsonArr = new JSONArray();
			
			
				System.out.println("Json object :: "+jsonArr);
			
			
			//Store the JSON object in JSON array as objects (For level 1 array element i.e Results)
	//		JSONArray jsonarr_1 = (JSONArray) jobj.get("results");
			
			//Get data for Results array
			/*for(int i=0; i<jsonarr_1.size(); i++)
			{
				//Store the JSON objects in an array
				//Get the index of the JSON object and print the values as per the index
				JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
				
				
				//Store the JSON object in JSON array as objects (For level 2 array element i.e Address Components)
				JSONArray jsonarr_2 = (JSONArray) jsonobj_1.get("Name");
				System.out.println("Elements under results array");
				System.out.println("\nPlace id: " +jsonobj_1.get("id"));
				System.out.println("Types: " +jsonobj_1.get("types"));
				
				
				//Get data for the Address Components array
				System.out.println("Elements under address_components array");
				System.out.println("The long names, short names and types are:");
				for(int j=0;j<jsonarr_2.size();j++)
				{
					//Same just store the JSON objects in an array
					//Get the index of the JSON objects and print the values as per the index
					JSONObject jsonobj_2 = (JSONObject) jsonarr_2.get(j);
					
					//Store the data as String objects
					String str_data1 = (String) jsonobj_2.get("long_name");
					System.out.println(str_data1);
					String str_data2 = (String) jsonobj_2.get("short_name");
					System.out.println(str_data2);
					System.out.println(jsonobj_2.get("types"));
					System.out.println("\n");
				}
				
			}*/
			//Disconnect the HttpURLConnection stream
			conn.disconnect();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		}

	}