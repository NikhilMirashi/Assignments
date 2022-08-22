package com.foodapp.util;

public class DBQueries {

	public static final String INSERTQUERY = "insert into fooditem(name,type,category,price) values(?,?,?,?)";
	public static final String UPDATEQUERY = "update fooditem set amount=? where item_id=?";
	public static final String DELTEQUERY = "delete from fooditem where item_id=?";
	public static final String SELECTQUERY = "select * from fooditem";
	public static final String SELECTBYTYPE = "select * from fooditem where type=?";
	public static final String SELECTBYCATEGORY = "select * from fooditem where category=?";
	public static final String SELECTBYFOODNAME = "select * from fooditem where name=?";
	
}
