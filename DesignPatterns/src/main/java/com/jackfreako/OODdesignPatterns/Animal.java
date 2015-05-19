package com.jackfreako.OODdesignPatterns;

public class Animal {

	private String name;
	private double weight;
	private double height;
	private String sound;
	
	
	public Animal(){
		
	}
		
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		if(weight > 0)
			this.weight = weight;
		else
			System.out.println("Weight must be greater than 0");
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void makeSound(){
		System.out.println("Command Animal Sound \n");
	}
	
}
