import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Propertyuse {

	@Test
	public void readnotepad() throws IOException
	{
		//File f=new File("D://fileread.txt");
		FileReader fs=new FileReader("D://filereadwrite.txt");
		BufferedReader bf=new BufferedReader(fs);
		String s=bf.readLine();
		while(s != null)
		{
			System.out.println(s);
		}
		
		
		
	}
	
	
	}


