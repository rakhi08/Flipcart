package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.TrackOrder;

public class TestTrackOrder {
	
	@Test
	public void testTrackOrdrer() throws IOException
	{
		HomePage track=new HomePage();
		TrackOrder track1=track.doTrackOrder();

	}

}
