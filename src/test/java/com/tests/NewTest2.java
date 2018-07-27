package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest2 {
	
	private static final By By = null;

	@Test
	public void testMercuryToursLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		
		//Assert.assertTrue(title.startsWith("Find a"));
		
		Assert.assertEquals(title, "Find a Flight: Mercury Tours: ");
		
		
		//driver.findElement(By.name("passCount"));
		
	}

	private Object name(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
