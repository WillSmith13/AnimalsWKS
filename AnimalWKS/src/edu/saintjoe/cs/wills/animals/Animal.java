package edu.saintjoe.cs.wills.animals;

public class Animal {
	
	String picture;
	String location;
	int weight; 
	
	/*......*/
	
	// Not we have 6 constructors, each one has a different signature
	// Even through we didn't write this before it was there by default 
	public Animal() {
		//This is a constructor
		this.location = "Nowhere";
		this.picture = "No picture"; 	
	}

	public Animal(String startingLocation) { 
		this.location = startingLocation;
	}
	
	public Animal(int startingweight) {
		// Legal but pointless 
		this.weight = startingweight;
	}
	
	//Add a two-String parameter here
	
	public Animal(String startLocation, String startPicture, int startWeight) {
		this.weight = startWeight;
		this.location = startLocation;
		this.picture = startPicture;
		
	}
	
	public Animal(int firstParm, String secondParm) {
		//pointless
	}
	
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