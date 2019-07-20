package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.diet.DietTeller;
import com.vanny96.springdemo.fortune.FortuneTeller;

public class TrackCoach implements Coach {
	private FortuneTeller fortuneTeller;
	private DietTeller dietTeller;
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}
	
	public void setDietTeller(DietTeller dietTeller) {
		this.dietTeller = dietTeller;
	}

	public String getDailyWorkout() {
		return "Run 3 miles every morning";
	}

	public String getYourLuck() {
		return  fortuneTeller.tellMyLuck();
	}

	public String getYourDiet() {
		return dietTeller.tellDiet();
	}

}
