package edu.saintjoe.cs.wills.animals;

public class AnimalTester {

	
public static void main(String[] args) { 
	//Demonstration of various constructors 
	// This instantiation calls the default 
	Animal myPet = new Animal();
	
	// This one uses the one parameter constructor 
	Animal myLocalPet = new Animal(23);
	
	
	
	
	System.out.println("My aniaml has" + myPet.location + "as its location");
	System.out.println("My animal has" + myLocalPet.location + "as its location");
}

}