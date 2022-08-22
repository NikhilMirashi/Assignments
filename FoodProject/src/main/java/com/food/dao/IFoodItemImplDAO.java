package com.food.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.food.model.FoodItem;

@Component
public class IFoodItemImplDAO implements IFoodItemDAO {

	@Override
	public List<FoodItem> findAll() {
		return foodMenu();
	}

	@Override
	public List<FoodItem> findByType(String type) {
		return foodMenu().stream().filter((str) -> str.getType().equals(type)).collect(Collectors.toList());
	}

	@Override
	public List<FoodItem> findByCategory(String category) {
		return foodMenu().stream().filter((str) -> str.getCategory().equals(category)).collect(Collectors.toList());
	}

	@Override
	public List<FoodItem> findByName(String foodName) {
		return foodMenu().stream().filter((str) -> str.getName().equals(foodName)).collect(Collectors.toList());
	}

	private List<FoodItem> foodMenu() {

		return Arrays.asList(new FoodItem(1, "dalroti", "veg", "main", 150),
				new FoodItem(2, "chikenmasala", "nonveg", "main", 160),
				new FoodItem(3, "chiken friedrice", "nonveg", "main", 190),
				new FoodItem(4, "manjurian soup", "veg", "starter", 170),
				new FoodItem(5, "straberrytharoma", "veg", "dessert", 500),
				new FoodItem(6, "chapathi rice", "veg", "main", 130));

	}

}
