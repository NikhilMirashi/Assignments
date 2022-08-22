package com.foodapp.repository;

import java.util.List;

import com.foodapp.model.FoodItem;

public interface IFoodItemDAO {
	
	List<FoodItem> findAll();
	void addFood(FoodItem foodItem);
	void updateFood(String foodName,int foodId);
	void deleteFood(int foodId);
	List<FoodItem> findByType(String type);
	List<FoodItem> findByCategory(String category);
	List<FoodItem> findByName(String foodName);

}
