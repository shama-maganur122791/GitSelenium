package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class NewTest6 {
	
	@Test
	public void test()
	{
		File file=new File("Book1.xlsx");
		try
		{
			InputStream is=new FileInputStream(file);
			
			XSSFWorkbook xssf=new XSSFWorkbook(is);
			
			XSSFSheet sheet1=xssf.getSheet("Sheet1");
			System.out.println("First row number"+sheet1.getFirstRowNum());
			System.out.println("Last row number"+sheet1.getLastRowNum());
			for(int i=1;i<=sheet1.getFirstRowNum();i++)
			{
				System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue()+"\t"+sheet1.getRow(i).getCell(1).getStringCellValue());
				
			}
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
			
		
	}

}
