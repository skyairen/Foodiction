package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mie.model.User;
import com.mie.model.Recipe;
import com.mie.util.DbUtil;

public class UserRecipesDao {

	private Connection connection;

	public UserRecipesDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addRecipeByUser(int recipeId, String username) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into UserRecipes(UserName,RecipeID) values (?, ? )");
			// Parameters start with 1
			preparedStatement.setString(1, username);
			preparedStatement.setInt(2, recipeId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		}
	
	public void deleteRecipeByUser(int recipeId, String username) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from UserRecipes where UserName=? AND RecipeID=?");
			// Parameters start with 1
			preparedStatement.setString(1, username);
			preparedStatement.setInt(2, recipeId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Recipe> getAllRecipesByUser(String username) {
		
		List<Recipe> recipes = new ArrayList<Recipe>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from UserRecipes where UserName=?");
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Recipe recipe  = new Recipe();
				recipe.setRecipeID(rs.getInt("RecipeID"));
				
				recipes.add(recipe);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return recipes;
		
	}
	
}

