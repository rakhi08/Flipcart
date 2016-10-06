package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import util.ExcelReader;

public class testHomePage {
	
	ExcelReader reader=new ExcelReader();
	
	@Test( dataProvider="readLoginData")
	
	public void m_testHomePage(String uname,String password, String runmode) throws FileNotFoundException, IOException
	{
	
		if(runmode.equals("Y"))
		{
			
		HomePage hm=new HomePage();
		
		HomePage hm1=hm.doLogin(uname, password);
		}
		
	
	
	}
	
	
	@DataProvider()
	public Object[][] readLoginData() throws FileNotFoundException, IOException
	{
		String LoginData=null;
		String[][] getLogindata=reader.readdata("LoginTest");
		//System.out.println(getLogindata[0][2]);
		return getLogindata;
		
	}

}
