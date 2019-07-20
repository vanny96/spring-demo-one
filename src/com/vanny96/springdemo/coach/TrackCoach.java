package com.vanny96.springdemo.coach;

import com.vanny96.springdemo.diet.DietTeller;
import com.vanny96.springdemo.fortune.FortuneTeller;

public class TrackCoach implements Coach {
	private FortuneTeller fortuneTeller;
	private DietTeller dietTeller;
	private String emailAddress;
	private String team;
	
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
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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
	
	public void beanInit() {
		System.out.println("Starting track coach:\n");
	}
	
	public void beanDestroy() {
		System.out.println("\nClosing track coach");
	}

}
