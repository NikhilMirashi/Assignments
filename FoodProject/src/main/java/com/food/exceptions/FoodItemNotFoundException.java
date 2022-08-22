package com.food.exceptions;

public class FoodItemNotFoundException extends FoodCategoryNotFoundException {

	private static final long serialVersionUID = 1L;

	public FoodItemNotFoundException() {

	}

	public FoodItemNotFoundException(String message) {
		super(message);
	}

}
