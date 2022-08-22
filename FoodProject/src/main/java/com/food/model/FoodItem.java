package com.food.model;

public class FoodItem {

	private int itemId;
	private String name;
	private String type;
	private String category;
	private double price;
	
	
	public FoodItem(int itemId, String name, String type, String category, double price) {
		this.itemId = itemId;
		this.name = name;
		this.type = type;
		this.category = category;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "FoodItem [itemId=" + itemId + ", name=" + name + ", type=" + type + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
	
	
	
}

