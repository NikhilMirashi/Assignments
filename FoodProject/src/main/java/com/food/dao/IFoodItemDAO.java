package com.food.dao;

import java.util.List;

import com.food.exceptions.FoodCategoryNotFoundException;
import com.food.exceptions.FoodItemNotFoundException;
import com.food.exceptions.FoodTypeNotFoundException;
import com.food.model.FoodItem;

public interface IFoodItemDAO {
	
	List<FoodItem> findAll();
	List<FoodItem> findByType(String type) throws FoodTypeNotFoundException;
	List<FoodItem> findByCategory(String category) throws FoodCategoryNotFoundException;
	List<FoodItem> findByName(String foodName) throws FoodItemNotFoundException;

}
