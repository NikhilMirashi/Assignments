package com.food.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.food.exceptions.FoodCategoryNotFoundException;
import com.food.service.IFoodService;
import com.food.service.IFoodServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.food");
		IFoodService foodService=context.getBean(IFoodServiceImpl.class, "foodServiceImpl");
		
		System.out.println("getAll");
		foodService.getAll().forEach(System.out::println);
		
		try {
			System.out.println();
			System.out.println("getByCategory");
			foodService.getByCategory("min").forEach(System.out::println);
			
			System.out.println();
			System.out.println("getByName");
			foodService.getByName("dalroi").forEach(System.out::println);
			
			System.out.println();
			System.out.println("getByType");
			foodService.getByType("noneg").forEach(System.out::println);
			
		} catch (FoodCategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
