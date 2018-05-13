package com.brainbitz.awt;

import java.awt.Button;
import java.awt.Frame;

public class SampleAwt extends Frame {

	public SampleAwt() {
		// TODO Auto-generated constructor stub
		Button b = new Button("Click Here");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SampleAwt sampleawt = new SampleAwt();
	}

}
