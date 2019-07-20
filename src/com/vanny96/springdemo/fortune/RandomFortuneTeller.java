package com.vanny96.springdemo.fortune;

import java.util.Random;

public class RandomFortuneTeller implements FortuneTeller {
	private String[] lines;
	
	public RandomFortuneTeller() {
		lines = new String[3];
		lines[0] = "This will be a good day";
		lines[1] = "Your day will go on as usually";
		lines[2] = "The world will burn in 5 seconds";
	}

	public String tellMyLuck() {
		String line="";
		Random r = new Random();
		
		line = lines[r.nextInt(3)];
		return line;
	}

}
