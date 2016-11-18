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
	
	public void addRecipeByUser(int recipeId, int userId) {
		
	}
	
	public void deleteRecipeByUser(int recipeId, int userId) {
		
	}
	
	public List<Recipe> getAllRecipesByUser(int userId) {
		
	}
	
}

