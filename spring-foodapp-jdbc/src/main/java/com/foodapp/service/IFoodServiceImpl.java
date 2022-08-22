package com.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.foodapp.model.FoodItem;
import com.foodapp.repository.IFoodItemDAO;

@Service

public class IFoodServiceImpl implements IFoodService {

	IFoodItemDAO foodItemDAO;

	@Autowired
	public void setFoodItemDAO(IFoodItemDAO foodItemDAO) {
		this.foodItemDAO = foodItemDAO;
	}

	@Override
	public List<FoodItem> getAll() {
		return foodItemDAO.findAll();
	}

	@Override
	public List<FoodItem> getByType(String type) {
		return foodItemDAO.findByType(type);
	}

	@Override
	public List<FoodItem> getByCategory(String category) {
		return foodItemDAO.findByCategory(category);
	}

	@Override
	public List<FoodItem> getByName(String foodName) {
		return foodItemDAO.findByName(foodName);
	}

	@Override
	public void addFood(FoodItem foodItem) {
		foodItemDAO.addFood(foodItem);
	}

	@Override
	public void updateFood(String foodName, int foodId) {
		foodItemDAO.updateFood(foodName, foodId);
	}

	@Override
	public void deleteFood(int foodId) {
		 foodItemDAO.deleteFood(foodId);
	}

}
