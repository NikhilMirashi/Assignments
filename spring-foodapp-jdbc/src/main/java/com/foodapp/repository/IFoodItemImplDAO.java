package com.foodapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.foodapp.model.FoodItem;
import com.foodapp.util.DBQueries;

@Repository
public class IFoodItemImplDAO implements IFoodItemDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<FoodItem> findAll() {
		
		List<FoodItem> foodList = jdbcTemplate.query(DBQueries.SELECTQUERY, new RowMapper<FoodItem>() {
			@Override
			public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {	
				FoodItem foodItem = new FoodItem();
				foodItem.setName(rs.getString("name"));
				foodItem.setItemId(rs.getInt("item_id"));
				foodItem.setType(rs.getString("type"));	
				foodItem.setCategory(rs.getString("category"));
				foodItem.setPrice(rs.getInt("price"));
				return foodItem;
			}

		});

		return foodList;
		
	}

	@Override
	public List<FoodItem> findByType(String type) {
		
		List<FoodItem> foodList = jdbcTemplate.query(DBQueries.SELECTBYTYPE, new RowMapper<FoodItem>() {
			@Override
			public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {	
				FoodItem foodItem = new FoodItem();
				foodItem.setName(rs.getString("name"));
				foodItem.setItemId(rs.getInt("item_id"));
				foodItem.setType(rs.getString("type"));	
				foodItem.setCategory(rs.getString("category"));
				foodItem.setPrice(rs.getInt("price"));
				return foodItem;
			}

		}, type);

		return foodList;
		
	}

	@Override
	public List<FoodItem> findByCategory(String category) {
		
		List<FoodItem> foodList = jdbcTemplate.query(DBQueries.SELECTBYCATEGORY, new RowMapper<FoodItem>() {
			@Override
			public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {	
				FoodItem foodItem = new FoodItem();
				foodItem.setName(rs.getString("name"));
				foodItem.setItemId(rs.getInt("item_id"));
				foodItem.setType(rs.getString("type"));	
				foodItem.setCategory(rs.getString("category"));
				foodItem.setPrice(rs.getInt("price"));
				return foodItem;
			}

		}, category);

		return foodList;
		
	}

	@Override
	public List<FoodItem> findByName(String foodName) {
		List<FoodItem> foodList = jdbcTemplate.query(DBQueries.SELECTBYFOODNAME, new RowMapper<FoodItem>() {
			@Override
			public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {	
				FoodItem foodItem = new FoodItem();
				foodItem.setName(rs.getString("name"));
				foodItem.setItemId(rs.getInt("item_id"));
				foodItem.setType(rs.getString("type"));	
				foodItem.setCategory(rs.getString("category"));
				foodItem.setPrice(rs.getInt("price"));
				return foodItem;
			}

		}, foodName);

		return foodList;
		
	}

	@Override
	public void addFood(FoodItem foodItem) {
		
		Object[] arrysFood= {foodItem.getName(),foodItem.getType(),foodItem.getCategory(),foodItem.getPrice()};
		jdbcTemplate.update(DBQueries.INSERTQUERY, arrysFood);
		
		
		
	}

	@Override
	public void updateFood(String foodName, int foodId) {

		jdbcTemplate.update(DBQueries.UPDATEQUERY, foodId,foodName);
		
	}

	@Override
	public void deleteFood(int foodId) {
		jdbcTemplate.update(DBQueries.DELTEQUERY, foodId);
		
	}

	
}
