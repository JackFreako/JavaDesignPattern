package com.jackfreako.OODdesignPatterns;

public abstract class Creature {

	
	protected String name;
	protected int weight;
	protected String sound;
	
	
	public abstract void setName(String mName);
	public abstract void setWeight(int mWeight);
	public abstract void setSound(String mSound);
	
	
	public abstract String getName();
	public abstract int getWeight();
	public abstract String getSound();
	
}
