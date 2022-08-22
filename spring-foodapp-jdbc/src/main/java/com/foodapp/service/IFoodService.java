package com.foodapp.service;

import java.util.List;

import com.foodapp.model.FoodItem;

public interface IFoodService {
	
	List<FoodItem> getAll();
	void addFood(FoodItem foodItem);
	void updateFood(String foodName,int foodId);
	void deleteFood(int foodId);
	List<FoodItem> getByType(String type);
	List<FoodItem> getByCategory(String category);
	List<FoodItem> getByName(String foodName);
}
