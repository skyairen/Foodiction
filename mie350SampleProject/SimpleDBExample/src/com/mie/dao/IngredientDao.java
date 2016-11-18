package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mie.model.Ingredient;
import com.mie.util.DbUtil;
import com.mie.model.Ingredient;


public class IngredientDao {

	private Connection connection;

	public IngredientDao() {
		connection = DbUtil.getConnection();
	}

public void addIngredient(Ingredient ingredient) {
		
	}
	
	public void deleteIngredient(int ingredientId) {
		
	}
	
	public void updateIngredient(Ingredient ingredient){
		
	}
	
	public List<Ingredient> getAllIngredients() {
		
	}
	
	public Ingredient getIngredientById(int ingredientId) {
		
	}
	
	public Ingredient getIngredientByName(String name) {
		
	}
	
	public List<Ingredient> getIngredientByKeyword(String keyword) {
		
	}
}