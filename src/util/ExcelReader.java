package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String[][] readdata (String sheetname) throws FileNotFoundException, IOException
	{
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("D:\\PanXpanSelenium_Updated\\Flipcart_POM_1\\src\\TestCase_Data\\Flipcart_Test_Cases.xlsx"));
		
		XSSFSheet sh=wb.getSheet(sheetname);
		
		int rows=sh.getLastRowNum();
		
		int cols=sh.getRow(0).getLastCellNum();
	
	String[][] data=new String[rows][cols];
	
	for(int i=1;i<=rows;i++)
	{
		XSSFRow row=sh.getRow(i);
		
		for(int j=0;j<cols;j++)
		{
			XSSFCell cell=row.getCell(j);
			
			data[i-1][j]=cell.getStringCellValue();
			
			
		}
		
	}
		
		return data;
		
	}
	

		
			
	
		
		}
		
		
		
	


