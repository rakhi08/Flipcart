package pages;

import org.openqa.selenium.By;

import Base.Testbase;

public class SearchPage extends Testbase {

	
	
	public void checkSearchResults(String searchdata1)
	{
		click("searchinputfield");
		input("searchinputfield",searchdata1);
		click("searchbutton");
		String categoryname=driver.findElement(By.xpath(OR.getProperty("searchtext"))).getText();
		if(categoryname.equals(searchdata1))
		{
			System.out.println("products found");
		}
		else
		{
			System.out.println("products not found");
		}
		
	}
	
}
