package com.jackfreako.singletondesignpattern;

public class ScrabbleTest {

	public static void main(String[] args) {

		
		Singleton scrabbleFirstInstance = Singleton.getInstance();
		System.out.println("Created object ID : " + System.identityHashCode(scrabbleFirstInstance));
		
		Singleton scrabbleSecondInstance = Singleton.getInstance();
		System.out.println("Created object ID : " + System.identityHashCode(scrabbleSecondInstance));
		
				
		System.out.println(scrabbleFirstInstance.getLetterList());
		System.out.println(scrabbleFirstInstance.getTiles(5));		
		
		System.out.println(scrabbleSecondInstance.getLetterList());
		
	}

}
