package com.brainbitz.inheritance;

public class FullTimeStudent extends Student {

	boolean status = true;
	public FullTimeStudent() {

	}

	public String validator() {
		if (courseList.size() == 4) {
			status = false;
			return "couse list full";
		}
		if (courseList.size() == 3) {
			status = true;
			return "you can add one more course";
		}
		if (courseList.size() < 3) {
			status = true;
			return "add some minimum 3 couses";
		}
		return "";
	}

}