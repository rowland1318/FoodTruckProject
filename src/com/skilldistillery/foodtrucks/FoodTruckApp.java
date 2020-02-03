package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	
	// F I E L D S
	
	private FoodTruck[] foodTrucksList = new FoodTruck[5];;
	private Scanner kb = new Scanner(System.in);
	
	// M E T H O D S

	public static void main(String[] args) {
		FoodTruckApp newFoodTruckApp = new FoodTruckApp();
		newFoodTruckApp.runFoodTruckApp();
	}
	
	public void runFoodTruckApp() {
			userInput();
			boolean menuLoop = true;
			while (menuLoop) {
				displayMenu();
				int userChoice = kb.nextInt();

				switch (userChoice) {
				case 1:
					listFoodTrucks();
					break;
				case 2:
					System.out.println("The Average Food Truck Rating is: " + averageFoodTruckRating(foodTrucksList));
					break;
				case 3:
					highestRatedFoodTruck();
					break;
				case 4:
					quit();
					menuLoop = false;
					break;
				default:
					System.out.println("Number Not Recognized! Please Select a Menu Item Between 1 and 4: ");
				}
			}
		}
	
	
	public void userInput() {

		System.out.println("Welcome to the Food Truck App, Where You Can Rate up to Five Food Trucks!");
		System.out.println();
		for (int i = 0; i < foodTrucksList.length; i++) {
			System.out.print("Please Enter Food Truck Name " + (i + 1) + " to Begin or Type \"Quit\" to Exit This Application: ");
			String foodTruckName = kb.nextLine();
			
			if (foodTruckName.equalsIgnoreCase("quit")) {
				System.out.println("Done Entering Food Trucks");
				break;
			}
			
			System.out.print("Please Enter the Type of Food at this Food Truck: ");
			String foodTruckType = kb.nextLine();
			
			System.out.print("Please Enter a Rating Between 1 and 5 That You Would Like to Give the Food Truck: ");
			int foodTruckRating = kb.nextInt();
			kb.nextLine();
			while(!(foodTruckRating>= 1 && foodTruckRating <=5)) {
				System.out.println("Please Give the Food Truck a Rating Between 1 and 5");
				foodTruckRating = kb.nextInt();
				kb.nextLine();
			}
			
			FoodTruck truck = new FoodTruck(foodTruckName, foodTruckType, foodTruckRating);
			foodTrucksList[i] = truck;
		}
		}

	
	public void displayMenu() {
	System.out.println("+--------------------------------+");
	System.out.println("|      Food Truck Main Menu      |");
	System.out.println("|       ------------------       |");
	System.out.println("|                                |");
	System.out.println("|       1: Food Truck List       |");
	System.out.println("|                                |");
	System.out.println("|2: Average Rating of Food Trucks|");
	System.out.println("|                                |");
	System.out.println("|  3: Highest Rated Food Truck   |");
	System.out.println("|                                |");
	System.out.println("|           4: Quit              |");
	System.out.println("+--------------------------------+");
	}
	
	public void listFoodTrucks() {
		for (FoodTruck foodTruckDisplay : foodTrucksList) {
			
			if (foodTruckDisplay != null) {
				System.out.println(foodTruckDisplay);
			} else {
				continue;
			}
		}
	}


	public double averageFoodTruckRating(FoodTruck[] foodtruck) {
		double foodTruckRating = 0.0;
		int counter = 0;
		for (int i = 0; i < foodtruck.length; i++) {

			if (foodtruck[i] != null) {
				counter++;
				foodTruckRating += foodtruck[i].getFoodTruckRating();
			}
			if (foodtruck[i] == null) {
				break;
			}
		}

		foodTruckRating = foodTruckRating / counter;
		return foodTruckRating;
	}
	
	public void highestRatedFoodTruck() {
		int highestRating = Integer.MIN_VALUE;
		FoodTruck highestratedfoodtruck = null;
		for (int i = 0; i < foodTrucksList.length; i++) {
			if (foodTrucksList[i] == null) {
				break;
			}
			if (foodTrucksList[i].getFoodTruckRating() >= highestRating) {
				highestRating = foodTrucksList[i].getFoodTruckRating();
				highestratedfoodtruck = foodTrucksList[i];
			}
			
		}
		System.out.println("The Highest Rated Food Truck is: " + highestratedfoodtruck);
	}
	
	
	public void quit() {
		System.out.println("Thank You for Using the Food Truck App");
	}

}
