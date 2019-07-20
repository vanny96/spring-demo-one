package com.vanny96.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vanny96.springdemo.coach.Coach;

public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("Coach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getYourLuck());
		System.out.println(coach.getYourDiet());
		
		context.close();
	}
}
