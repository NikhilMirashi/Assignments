package com.foodapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodapp.model.FoodItem;
import com.foodapp.service.IFoodService;

@SpringBootApplication
public class SpringFoodappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFoodappJdbcApplication.class, args);
	}

	
	IFoodService foodService;
	
	@Autowired
	public void setFoodService(IFoodService foodService) {
		this.foodService = foodService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//foodService.addFood(new FoodItem(1,"dalroti", "veg", "main",35));
		
		FoodItem food1=new FoodItem("dalchawal", "veg", "main",50);
		FoodItem food2=new FoodItem("friedrice", "veg", "main",80);
		FoodItem food3=new FoodItem("friedrice", "nonveg", "main",120);
		FoodItem food4=new FoodItem("alooparatha", "veg", "main",180);
		
		
		foodService.addFood(food4);
		
		foodService.deleteFood(3);
		foodService.updateFood("eggfriedrice", 4);
		
		System.out.println("getAll");
		foodService.getAll().forEach(System.out::println);
		
		System.out.println();
		System.out.println("getByCategory");
		foodService.getByCategory("main").forEach(System.out::println);
		
		System.out.println();
		System.out.println("getByType");
		foodService.getByType("nonveg").forEach(System.out::println);
		
		System.out.println();
		System.out.println("getByName");
		foodService.getByName("dalroti").forEach(System.out::println);
		
	}

}
