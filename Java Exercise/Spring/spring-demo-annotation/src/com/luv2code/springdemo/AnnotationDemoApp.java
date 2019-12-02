package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		//read the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theBasketBallCoach = context.getBean("basketballCoach", Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
