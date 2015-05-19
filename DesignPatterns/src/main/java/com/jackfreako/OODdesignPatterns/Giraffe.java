package com.jackfreako.OODdesignPatterns;

public class Giraffe extends Creature{

	private String name;
	
	@Override
	public void setName(String mName) {
		// TODO Auto-generated method stub
		this.name = mName;
	}

	@Override
	public void setWeight(int mWeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSound(String mSound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

}
