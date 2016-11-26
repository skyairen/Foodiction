package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mie.model.Store;
import com.mie.model.User;
import com.mie.util.DbUtil;

public class StoresDao {
	
	private Connection connection;

	public StoresDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addStore(Store store) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into Store(StoreID, Name, Address, PostalCode, Location) "
							+ "values (?, ?, ?, ?, ?)");
			// Parameters start with 1
			preparedStatement.setInt(1, store.getStoreID());
			preparedStatement.setString(2, store.getName());
			preparedStatement.setString(3, store.getAddress());
			preparedStatement.setString(4, store.getPostalCode());
			preparedStatement.setInt(5, store.getLocation());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStore(int storeId) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from Store where StoreID=?");
			// Parameters start with 1
			preparedStatement.setInt(1, storeId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStore(Store store){
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("update Store "
							+ "set StoreID=?, Name=?, Address=?, PostalCode=?, Location=? "
							+ "where StoreID=?");
			preparedStatement.setInt(1, store.getStoreID());
			preparedStatement.setString(2, store.getName());
			preparedStatement.setString(3, store.getAddress());
			preparedStatement.setString(4, store.getPostalCode());
			preparedStatement.setInt(5, store.getLocation());
			preparedStatement.setInt(6, store.getStoreID());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Store> getAllStores() {
		List<Store> stores = new ArrayList<Store>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Stores");
			while (rs.next()) {
				Store store = new Store();
				store.setStoreID(rs.getInt("StoreID"));
				store.setName(rs.getString("Name"));
				store.setAddress(rs.getString("Address"));
				store.setPostalCode(rs.getString("PostalCode"));
				store.setLocation(rs.getInt("Location"));
				stores.add(store);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stores;
	}
	
	public Store getStoreById(int storeId) {
		Store store = new Store();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from Stores where StoreID=?");
			preparedStatement.setInt(1, storeId);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				store.setStoreID(rs.getInt("StoreID"));
				store.setName(rs.getString("Name"));
				store.setAddress(rs.getString("Address"));
				store.setPostalCode(rs.getString("PostalCode"));
				store.setLocation(rs.getInt("Location"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return store;
	}
	
	public Store getStoreByName(String name) {
		Store store = new Store();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from Stores where Name=?");
			preparedStatement.setString(1, name);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				store.setStoreID(rs.getInt("StoreID"));
				store.setName(rs.getString("Name"));
				store.setAddress(rs.getString("Address"));
				store.setPostalCode(rs.getString("PostalCode"));
				store.setLocation(rs.getInt("Location"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return store;

	}
	
	public List<Store> getStoreByKeyword(String keyword) {
		List<Store> stores = new ArrayList<Store>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from Stores where Name LIKE ? OR Address LIKE ? OR PostalCode LIKE ? OR "
							+ "Location LIKE ?"); //after we make the location table, we can include proximity search here
						
			preparedStatement.setString(1, "%" + keyword + "%");
			preparedStatement.setString(2, "%" + keyword + "%");
			preparedStatement.setString(3, "%" + keyword + "%");
			preparedStatement.setString(4, "%" + keyword + "%");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Store store = new Store();
				store.setStoreID(rs.getInt("StoreID"));
				store.setName(rs.getString("Name"));
				store.setAddress(rs.getString("Address"));
				store.setPostalCode(rs.getString("PostalCode"));
				store.setLocation(rs.getInt("Location"));
				stores.add(store);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stores;
	}

}
