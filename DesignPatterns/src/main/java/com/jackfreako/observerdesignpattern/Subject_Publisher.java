package com.jackfreako.observerdesignpattern;

public interface Subject_Publisher {	
		
	public void register(Observer mObserver);
	
	public void unregister(Observer mObserver);
	
	public void notifyObserver();
	
}
