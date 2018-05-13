package com.brainbitz.inputoutput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		String str;
		FileReader fr=new FileReader("C:\\dacm.Dat");
		BufferedReader br=new BufferedReader(fr);
		try {
			while((str=br.readLine()) !=null)
			{
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
