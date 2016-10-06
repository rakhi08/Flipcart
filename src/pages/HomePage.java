package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.ExcelReader;
import Base.Testbase;

public class HomePage extends Testbase {
	ExcelReader ex=new ExcelReader();
	
	public HomePage()
	{
		compareTitle("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
	}

	public HomePage doLogin(String uname,String password) throws FileNotFoundException, IOException
	{
		
		if(checkPresence("login")==false);
		{
			//fail=true;
			capturescreenshot("homepage fails");
		}
		click("login");
		input("usernamefield",uname);
		input("passwordfield",password);
		checkPresence("submitbutton");
		click("submitbutton");
		return  new HomePage();
		
		
	}

	public TrackOrder doTrackOrder() throws IOException
	{
		//String greetingText=driver.findElement(By.xpath(OR.getProperty("welcomeuser"))).getAttribute("value");
	if(checkPresence("welcomeuser")==true)
	{
		click("trackorder");
		
		
		
	}
	if(checkPresence("welcomeuser")==false)
	{
		capturescreenshot("homepage fails");
		
	}
	return new TrackOrder();
	
	
	
	}
	
	public SearchPage doSearch()
	{
		
		return new SearchPage();
		
		
	}

}
