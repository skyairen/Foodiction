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
import com.mie.model.Ingredient;
import com.mie.util.DbUtil;

public class IngredientStoresDao {

	private Connection connection;

	public IngredientStoresDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addIngredientToStore(int ingredientId, int storeId, int price) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into ingredientsStores(StoreID,IngredientID,Price) values (?, ?, ? )");
			// Parameters start with 1
			preparedStatement.setInt(1, storeId);
			preparedStatement.setInt(2, ingredientId);
			preparedStatement.setDouble(3, price);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	public void deleteIngredientFromStore(int ingredientId, int storeId) {
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from ingredientsStores where StoreID=? AND IngredientID=?");
			// Parameters start with 1
			preparedStatement.setInt(1, storeId);
			preparedStatement.setInt(2, ingredientId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		
	
	public List<Ingredient> getAllIngredientsInStore(int storeId) {
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from ingredientsStores where StoreID=?");
			preparedStatement.setInt(1, storeId);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Ingredient ingredient  = new Ingredient();
				ingredient.setIngredientID(rs.getInt("IngredientID"));
				//ingredient.setPrice(rs.getDouble("Price")); WE NEED THE PRICE IN INGREDIENTS
				
				ingredients.add(ingredient);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ingredients;
		
	}
	
	public List<Store> getAllStoresWithIngredient(int ingredientId) {
		
		List<Store> stores = new ArrayList<Store>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from ingredientsStores where IngredientID=?");
			preparedStatement.setInt(1, ingredientId);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Store store  = new Store();
				Store.setStoreID(rs.getInt("StoreID"));
				//Store.setPrice(rs.getDouble("Price")); WE NEED THE PRICE IN INGREDIENTS
				
				stores.add(store);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stores;
		
	}

}

//get store and price given ID

//object pricesAndStore

//string ingrediantName
//arraylist stores
//arraylist prices;

//store[0] = 'Loblaws'
//store[1] = 'metro'

//price[0] = 4
//price[1] = 3.5
