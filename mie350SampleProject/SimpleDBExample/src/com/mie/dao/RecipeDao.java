package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mie.model.Recipe;
import com.mie.util.DbUtil;

public class RecipeDao {

	private Connection connection;

	public RecipeDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addRecipe(Recipe recipe) {
		
	}
	
	public void deleteRecipe(int recipeId) {
		
	}
	
	public void updateRecipe(Recipe recipe){
		
	}
	
	public List<Recipe> getAllRecipes() {
		
	}
	
	public Recipe getRecipeById(int recipeId) {
		
	}
	
	public Recipe getRecipeByName(String name) {
		
	}
	
	public List<Recipe> getRecipeByKeyword(String keyword) {
		
	}
}
