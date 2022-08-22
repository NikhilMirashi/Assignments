package com.food.exceptions;

public class FoodTypeNotFoundException extends FoodCategoryNotFoundException {

	private static final long serialVersionUID = 1L;

	public FoodTypeNotFoundException() {
		
	}

	public FoodTypeNotFoundException(String message) {
		super(message);
	}

}
