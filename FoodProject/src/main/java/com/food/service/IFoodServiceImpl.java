package com.food.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.food.dao.IFoodItemDAO;
import com.food.exceptions.FoodCategoryNotFoundException;
import com.food.exceptions.FoodItemNotFoundException;
import com.food.exceptions.FoodTypeNotFoundException;
import com.food.model.FoodItem;

@Service
@Component
public class IFoodServiceImpl implements IFoodService {

	IFoodItemDAO foodItemDAO;

	@Autowired
	public void setFoodItemDAO(IFoodItemDAO foodItemDAO) {
		this.foodItemDAO = foodItemDAO;
	}

	@Override
	public List<FoodItem> getAll() {
		List<FoodItem> foodList = foodItemDAO.findAll();
		if (foodList.isEmpty()) {
			return null;
		}
		return foodList.stream().sorted((FoodItem f1, FoodItem f2) -> f1.getType().compareTo(f2.getType()))
				.collect(Collectors.toList());
	}

	@Override
	public List<FoodItem> getByType(String type) throws FoodTypeNotFoundException {

		List<FoodItem> foodList = foodItemDAO.findByType(type);
		if (foodList.isEmpty()) {
			throw new FoodTypeNotFoundException("food type is not found");
		}
		return foodList.stream().sorted((FoodItem f1, FoodItem f2) -> f1.getType().compareTo(f2.getType()))
				.collect(Collectors.toList());
	}

	@Override
	public List<FoodItem> getByCategory(String category) throws FoodCategoryNotFoundException {

		List<FoodItem> foodList = foodItemDAO.findByCategory(category);
		if (foodList.isEmpty()) {
			throw new FoodCategoryNotFoundException("food category is not found");

		}
		return foodList.stream().sorted((FoodItem f1, FoodItem f2) -> f1.getCategory().compareTo(f2.getCategory()))
				.collect(Collectors.toList());

	}

	@Override
	public List<FoodItem> getByName(String foodName) throws FoodItemNotFoundException {

		List<FoodItem> foodList = foodItemDAO.findByName(foodName);
		if (foodList.isEmpty()) {
			throw new FoodItemNotFoundException("food item is not found");
		}

		return foodList.stream().sorted((FoodItem f1, FoodItem f2) -> f1.getName().compareTo(f2.getCategory()))
				.collect(Collectors.toList());

	}

}
