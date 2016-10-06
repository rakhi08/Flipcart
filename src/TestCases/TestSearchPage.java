package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import util.ExcelReader;

public class TestSearchPage {
	ExcelReader ex=new ExcelReader();
	@Test(dataProvider="readSearchData")
	public void testSearchResults(String searchdata, String runmode)
	{
	
		HomePage hp=new HomePage();
		
		
		SearchPage sp=hp.doSearch();
		sp.checkSearchResults(searchdata);
	
	
	
	}
		
@DataProvider()
public Object[][] readSearchData() throws FileNotFoundException, IOException
{
	
	
	String[][] readSearchData=ex.readdata("SearchTest");
	return readSearchData;
	
}
}
