package com.mie.model;

public class Recipe {
	private int recipeID;
	private String name;
	private int favorites;
	private int iMadeIt;
	private String foodType;
	private String tips;
	private String directions;
	private int attachments; //TODO
	private String uploadedBy;
	
	public int getRecipeID() {
		return recipeID;
	}
	public String getName() {
		return name;
	}
	public int getFavorites(){
		return favorites;
	}
	public int getIMadeIt() {
		return iMadeIt;
	}
	public String getFoodType() {
		return foodType;
	}
	public String getTips() {
		return tips;
	}
	public String getDirections() {
		return directions;
	}
	public int getAttachments() {
		return attachments; //TODO
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	
	public void setRecipeID(int recipeID) {
		this.recipeID = recipeID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFavorites(int favorites) {
		this.favorites = favorites;
	}
	public void setIMadeIt(int iMadeIt) {
		this.iMadeIt=iMadeIt;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public void setTips(String tips) {
		this.tips=tips;
	}
	public void setDirections(String directions) {
		this.directions=directions;
	}
	public void setAttachments(int attachments) {
		this.attachments=attachments; //TODO
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy=uploadedBy;
	}


}