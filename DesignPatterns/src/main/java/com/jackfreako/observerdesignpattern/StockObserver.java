package com.jackfreako.observerdesignpattern;

public class StockObserver implements Observer{

	
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
		
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject_Publisher stockGrabber;
	
	public StockObserver(Subject_Publisher mStockGrabber){
		
		this.stockGrabber = mStockGrabber;
		this.observerID = ++ this.observerIDTracker;
		System.out.println("New observer "  + this.observerID);
		this.stockGrabber.register(this);
		
	}
	
	
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		// TODO Auto-generated method stub
		
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		
		printPrices();
		
	}
	
	public void printPrices(){
		
		System.out.println(this.observerID + "\nIBM: " + this.ibmPrice +
				"\nAAPL: "+ this.applePrice + "\nGOOG : " + this.googlePrice);
				
	}

}
