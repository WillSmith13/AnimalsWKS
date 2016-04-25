package edu.saintjoe.cs.wills.animals;

public class Animal {
	
	String picture;
	String location;
	int weight; 
	int age;
	/*......*/
	
	// Not we have 6 constructors, each one has a different signature
	// Even through we didn't write this before it was there by default 
	public Animal() {
		//This is a constructor #1
		this.location = "Nowhere";
		this.picture = "No picture"; 	
	}
	 
	//#2
	//public Animal(String startingLocation) { 
		//this.location = startingLocation;
	//}
	
	//#3
	public Animal(int weight, int age) {
		this.age = age;
	}
	
	//#4
	public Animal(int startingweight) {
		// Legal but pointless 
		this.weight = startingweight;
	}
	
	//Add a two-String parameter here
	
	//#5
	public Animal(String startLocation, String startPicture, int startWeight) {
		this.weight = startWeight;
		this.location = startLocation;
		this.picture = startPicture;
		
	}
	
	//#6
	public Animal(int firstParm, String secondParm) {
		//pointless
	}
	
	//#7
	public Animal(String firstParm, int secondParm) {
		// Do nothing just for fun 
	}
	
	public String makeNoise() {
		return ("ommmmmmmmmm");
}

	public void eat() {
		System.out.println( " Animal is eating ");
	}
}