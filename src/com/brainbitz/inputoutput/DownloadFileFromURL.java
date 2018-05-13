package com.brainbitz.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadFileFromURL {
	
	public static void main(String[] args) throws IOException{
	
	URL website = new URL("http://api.openweathermap.org/data/2.5/weather?q=Kochi&appid=4cc02bd95c4f497bbe78a6c84a57b323");
	
	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	
	FileOutputStream fos = new FileOutputStream("information.txt");
	
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	
	System.out.println("done");
	
	//jsonObject = new JSONObject(information.txt);

}
}
