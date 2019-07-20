package com.vanny96.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vanny96.springdemo.coach.Coach;

public class ScopeSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ScopeApplicationContext.xml");
		
		Coach coach = context.getBean("Coach",  Coach.class);
		
		Coach alphaCoach = context.getBean("Coach",  Coach.class);
		
		boolean result = coach == alphaCoach;
		
		System.out.println("Pointing to the same object: "+result);

		System.out.println("First coach memory address: "+coach);
		
		System.out.println("Second coach memory address: "+alphaCoach);
		
		context.close();
	}

}
