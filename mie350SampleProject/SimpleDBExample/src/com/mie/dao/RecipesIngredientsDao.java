package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mie.model.Ingredient;
import com.mie.model.Recipe;
import com.mie.util.DbUtil;

public class RecipesIngredientsDao {

	private Connection connection;

	public RecipesIngredientsDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addIngredientToRecipe(int ingredientId, int recipeId) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into RecipesIngredients(RecipeID,IngredientID) values (?, ? )");
			// Parameters start with 1
			preparedStatement.setInt(1, recipeId);
			preparedStatement.setInt(2, ingredientId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public void deleteIngredientFromRecipe(int ingredientId, int recipeId) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from RecipesIngredients where RecipeID=? AND IngredientID=?");
			// Parameters start with 1
			preparedStatement.setInt(1, recipeId);
			preparedStatement.setInt(2, ingredientId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	public List<Ingredient> getAllIngredientsInRecipe(int recipeId) {
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from RecipesIngredients where RecipeID=?");
			preparedStatement.setInt(1, recipeId);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Ingredient ingredient  = new Ingredient();
				ingredient.setIngredientID(rs.getInt("IngredientID"));
				ingredients.add(ingredient);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ingredients;
		
	}
		
	
	public List<Recipe> getAllRecipesWithIngredient(int ingredientId) {
		
		List<Recipe> recipes = new ArrayList<Recipe>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from RecipesIngredients where IngredientID=?");
			preparedStatement.setInt(1, ingredientId);
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
