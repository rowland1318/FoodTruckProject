package com.skilldistillery.foodtrucks;

public class FoodTruck {
	
	// F I E L D S
	private static int foodTruckNextId=1;
	private String foodTruckName;
	private  String foodTruckType;
	private int foodTruckRating;
	private int foodTruckID;
	
	// C O N S T R U C T O R
	
	public FoodTruck (String foodTruckName, String foodTruckType, int foodTruckRating) {
		this.foodTruckName = foodTruckName;
		this.foodTruckType = foodTruckType;
		this.foodTruckRating = foodTruckRating;
		this.foodTruckID = foodTruckNextId;
		foodTruckNextId++;
	}

	
	
	// M E T H O D S
	
	
	
	
	public String getFoodTruckName() {
		return foodTruckName;
	}
	
	@Override
	public String toString() {
		return "Food Truck Name: " + foodTruckName + ", Type of Food: " + foodTruckType + ", Food Truck Rating: "
				+ foodTruckRating + ", Food Truck Unique ID: " + foodTruckID;
	}


	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}
	
	public String getFoodTruckType() {
		return foodTruckType;
	}
	
	public void setFoodTruckType(String foodTruckType) {
		this.foodTruckType = foodTruckType;
	}
	
	public int getFoodTruckRating() {
		return foodTruckRating;
	}
	
	public void setFoodTruckRating(int foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}
	
}

