package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mie.model.Ingredient;
import com.mie.model.Store;
import com.mie.util.DbUtil;

public class IngredientStoresDao {

	private Connection connection;

	public IngredientStoresDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addIngredientToStore(int ingredientId, int storeId) {
		
	}
	
	public void deleteIngredientFromStore(int ingredientId, int storeId) {
		
	}
	
	public List<Ingredient> getAllIngredientsInStore(int storeId) {
		
	}
	
	public List<Store> getAllStoresWithIngredient(int ingredientId) {
		
	}
}
