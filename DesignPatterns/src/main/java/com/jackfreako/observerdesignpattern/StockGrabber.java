package com.jackfreako.observerdesignpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject_Publisher{
	
	private ArrayList <Observer> observers;
	
	double ibmPrice;
	double googlePrice;
	double applePrice;
	
	public StockGrabber(){
		this.observers = new ArrayList<Observer>();
	}
	
	
	public void register(Observer mObserver) {
		// TODO Auto-generated method stub
		this.observers.add(mObserver);
		
	}

	public void unregister(Observer mObserver) {
		// TODO Auto-generated method stub
		
		int observerIndex = this.observers.indexOf(mObserver);
		System.out.println("Observer " + (observerIndex+1) +" deleted");
		this.observers.remove(observerIndex);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for ( Observer o : observers){
			o.update(ibmPrice, applePrice, googlePrice);
		}
		
	}
		
	public void setIBMPrice(double mIBMPrice){
		this.ibmPrice = mIBMPrice;
		notifyObserver();
	}

	public void setGoogle(double mGooglePrice){
		this.googlePrice = mGooglePrice;
		notifyObserver();
	}
	
	public void setApplePrice(double mApplePrice){
		this.applePrice = mApplePrice;
		notifyObserver();
	}
	
}
