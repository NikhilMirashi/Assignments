package com.food.service;

import java.util.List;

import com.food.exceptions.FoodCategoryNotFoundException;
import com.food.exceptions.FoodItemNotFoundException;
import com.food.exceptions.FoodTypeNotFoundException;
import com.food.model.FoodItem;

public interface IFoodService {
	
	List<FoodItem> getAll();
	List<FoodItem> getByType(String type) throws FoodTypeNotFoundException;
	List<FoodItem> getByCategory(String category) throws FoodCategoryNotFoundException;
	List<FoodItem> getByName(String foodName) throws FoodItemNotFoundException;
}
