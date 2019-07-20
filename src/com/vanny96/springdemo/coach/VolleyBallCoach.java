package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.fortune.FortuneTeller;

public class VolleyBallCoach implements Coach {
	private FortuneTeller fortuneTeller;

	public VolleyBallCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}

	public String getDailyWorkout() {
		return "Take 50 shots on your face";
	}
	
	public String getYourLuck() {
		return fortuneTeller.tellMyLuck();
	}

}
