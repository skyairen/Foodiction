package com.mie.model;

public class Store {
	private int storeID;
	private String name;
	private String address;
	private String postalCode;
	private int location;
	
	public int getStoreID()			{ return storeID;	}
	public String getName()			{ return name; 		}
	public String getAddress()		{ return address;	}
	public String getPostalCode()	{ return postalCode;}
	public int getLocation()		{ return location;	}
	
	public void setStoreID(int sid) {
		this.storeID = sid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPostalCode(String pc) {
		this.postalCode = pc;
	}
	
	public void setLocation(int loc) {
		this.location = loc;
	}
}
