package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.diet.DietTeller;
import com.vanny96.springdemo.fortune.FortuneTeller;

public class VolleyBallCoach implements Coach {
	private FortuneTeller fortuneTeller;
	private DietTeller dietTeller;

	public VolleyBallCoach() {
		super();
	}

	public VolleyBallCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}
	
	public void setDietTeller(DietTeller dietTeller) {
		this.dietTeller = dietTeller;
	}

	public String getDailyWorkout() {
		return "Take 50 shots on your face";
	}
	
	public String getYourLuck() {
		return fortuneTeller.tellMyLuck();
	}

	public String getYourDiet() {
		return dietTeller.tellDiet();
	}

}
