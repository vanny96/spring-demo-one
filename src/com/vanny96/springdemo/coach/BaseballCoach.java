package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.fortune.FortuneTeller;

public class BaseballCoach implements Coach{
	private FortuneTeller fortuneTeller;

	public BaseballCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}
	
	public String getDailyWorkout(){
		return "Spend 30 minutes in the batting practice";
	}

	public String getYourLuck() {
		// TODO Auto-generated method stub
		return  fortuneTeller.tellMyLuck();
	}
}
