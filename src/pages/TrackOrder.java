package pages;

import Base.Testbase;

public class TrackOrder extends Testbase {
	public TrackOrder()
	{
		compareTitle("Flipkart.com: Your Order History");
	}

	public void checkPastOrder()
	{
		click("pastorder");
	}
	
}
