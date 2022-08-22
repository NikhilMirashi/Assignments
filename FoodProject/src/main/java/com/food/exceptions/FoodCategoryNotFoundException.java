package com.food.exceptions;

public class FoodCategoryNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public FoodCategoryNotFoundException() {
		
	}

	public FoodCategoryNotFoundException(String message) {
		super(message);
	}

	

}
