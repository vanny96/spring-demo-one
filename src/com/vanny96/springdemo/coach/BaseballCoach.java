package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.diet.DietTeller;
import com.vanny96.springdemo.fortune.FortuneTeller;

public class BaseballCoach implements Coach{
	private FortuneTeller fortuneTeller;
	private DietTeller dietTeller;

	public BaseballCoach() {
		super();
	}

	public BaseballCoach(FortuneTeller fortuneTeller) {
		super();
		this.fortuneTeller = fortuneTeller;
	}
	
	
	public void setDietTeller(DietTeller dietTeller) {
		this.dietTeller = dietTeller;
	}

	public String getDailyWorkout(){
		return "Spend 30 minutes in the batting practice";
	}

	public String getYourLuck() {
		return  fortuneTeller.tellMyLuck();
	}

	public String getYourDiet() {
		return dietTeller.tellDiet();
	}
}
