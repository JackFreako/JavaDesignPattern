package com.jackfreako.observerdesignpattern;


public class GrabStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		StockGrabber thePublisher = new StockGrabber();	
		
		@SuppressWarnings("unused")
		StockObserver observer1 = new StockObserver(thePublisher);		
		
		
	    thePublisher.setApplePrice(677.00);
	    thePublisher.setIBMPrice(197.00);
	    thePublisher.setGoogle(670.40);
		
	    @SuppressWarnings("unused")
		StockObserver observer2 = new StockObserver(thePublisher);
	    
	    thePublisher.setApplePrice(677.00);
	    thePublisher.setIBMPrice(197.00);
	    thePublisher.setGoogle(670.40);
		
	    
	    thePublisher.unregister(observer1);

	}

}
