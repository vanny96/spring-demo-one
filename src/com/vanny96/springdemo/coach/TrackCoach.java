package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.fortune.FortuneTeller;

public class TrackCoach implements Coach {
	private FortuneTeller fortuneTeller;

	public TrackCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}

	public String getDailyWorkout() {
		return "Run 3 miles every morning";
	}

	public String getYourLuck() {
		// TODO Auto-generated method stub
		return  fortuneTeller.tellMyLuck();
	}

}
