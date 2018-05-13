package com.brainbitz.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

class InetAddressTest
{
	public static void main(String args[]) throws UnknownHostException {
		byte[] addr = null;
		InetAddress Address = InetAddress.getLocalHost();		
		System.out.println(Address);
		
		Address = InetAddress.getByName("www.HerbSchildt.com");
		System.out.println(Address);

		Address = InetAddress.getByName("www.gmaxgps.com");
		System.out.println(Address);
		
		Address = InetAddress.getByAddress("104.18.60.151", addr);
		System.out.println(addr);

		InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
		for (int i = 0; i < SW.length; i++)
			System.out.println(SW[i]);
	}
}