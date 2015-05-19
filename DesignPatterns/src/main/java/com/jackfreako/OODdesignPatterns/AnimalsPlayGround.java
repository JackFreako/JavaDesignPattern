package com.jackfreako.OODdesignPatterns;

public class AnimalsPlayGround {

	public static void main(String [] args){
		
		Animal a = new Animal();
		a.makeSound();
		
		Animal kitty = new Cat();
		kitty.setName("Frisky");
		kitty.makeSound();
		
		
		Animal doggy = new Dog();
		doggy.setName("orion");
		doggy.makeSound();
		

		Animal [] animals = new Animal[2];
		animals[0] = doggy;
		animals[1] = kitty;
		
		
		for(Animal animal: animals){
			animal.makeSound();
		}
		
		
		Giraffe theGiraffe = new Giraffe();
		theGiraffe.setName("Frank");
		
		System.out.println(theGiraffe.getName());
	}
}
