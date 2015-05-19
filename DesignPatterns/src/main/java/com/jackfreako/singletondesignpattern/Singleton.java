package com.jackfreako.singletondesignpattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;


public class Singleton {

	// Instance of the Singleton class
	private static Singleton firstInstance = null;
		
	//Note : A private constructor
	private Singleton(){
		
	}
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};
	
	private LinkedList<String> scrabbleLetterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	//for slowing down the first thread
	static boolean	firstThread = true;
	
	// The universally used getInstace method
	public static Singleton getInstance(){
		
		if(firstInstance == null)
		{
			
			if(firstThread){
				
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				
			}
			
			
			//Lazy instantiation , object created if only needed 
			firstInstance = new Singleton();
			Collections.shuffle(firstInstance.scrabbleLetterList);
		}
		
		return firstInstance;
	}

	
	
	public LinkedList<String> getLetterList(){
		
		// Note : How instance variables of the Singleton class are being accessed using the 'firstInstance' object
		return firstInstance.scrabbleLetterList;
	}
	
	
	public LinkedList<String> getTiles(int numTiles){
		
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for (int i=0; i <= numTiles; i++){
			tilesToSend.add(firstInstance.scrabbleLetterList.remove(0));
		}
		
		return tilesToSend;
	}
	
	
}
