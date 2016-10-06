package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import testng_listeners.ErrorUtil;



public class Testbase {
	
	public static WebDriver driver=null;
	public static Properties CONFIG=null;
	public static Properties OR=null;

	public FileInputStream ip=null;
	
	
	public Testbase() 
	{
		
		
	// initializing the config and or files
		try{
		CONFIG=new Properties();
		
	ip = new FileInputStream(System.getProperty("user.dir")+"//src//config/config.properties");
		CONFIG.load(ip);
		}
		catch(Exception e)
		{
			
		}
		try{
OR=new Properties();
		
		 ip = new FileInputStream(System.getProperty("user.dir")+"//src//config/or.properties");
		OR.load(ip);
		}
		catch(Exception e)
		{
			
		}
		if(driver==null)
		{
			if(CONFIG.getProperty("browser").equals("firefox"))
					{
				System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.flipkart.com/?affid=apbsoluti");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			}
			else
				if(CONFIG.getProperty("browser").equals("chrome"))
				{
					System.setProperty("webdriver.driver.chrome", "D:\\PanXpanSelenium_Updated\\Flipcart_POM_1\\src\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
	
				}
	
			
		}
		
		
	
	}
	
	
	
	public boolean click(String webelement)
	{
		try
		{
			driver.findElement(By.xpath(OR.getProperty(webelement))).click();
		}
		catch(Throwable t)
		{
			ErrorUtil.addVerificationFailure(t);
			Assert.fail("Element is not clickable");
			return false;
		}
		return true;
		
	}
	
	
public void input(String webelement,String text)
{
	try
	{
		driver.findElement(By.xpath(OR.getProperty(webelement))).sendKeys(text);
	}
	catch(Exception e)
	{
		
	}
}
public boolean checkPresence(String xpathKey){
	//
	
	try{
		int count =driver.findElements(By.xpath(OR.getProperty(xpathKey))).size();
	Assert.assertTrue(count>0, "No element present");
	
	}catch(Throwable t){
		ErrorUtil.addVerificationFailure(t);
		//Assert.fail("Element not found");
		return false;
	}
	return true;
}


public boolean compareTitle(String expectedtitle)
{
	try{
	String actual=driver.getTitle();
	Assert.assertEquals(actual, expectedtitle);
	}
	catch(Throwable t)
	{
		ErrorUtil.addVerificationFailure(t);
		Assert.fail("Title do not match");
		return false;
	}
	return true;
}


public void capturescreenshot(String filename) throws IOException{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+filename+".jpg"));





}
}