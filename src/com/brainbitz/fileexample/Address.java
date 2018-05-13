package com.brainbitz.fileexample;


import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	private String place;
	private Integer pin;
	
	public Address() {

	}

	public Address(String place, Integer pin) {
		super();
		this.place = place;
		this.pin = pin;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address  : place=" + place + ", pin=" + pin + "";
	}
	
	
}
