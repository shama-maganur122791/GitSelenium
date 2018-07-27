package com.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class NewTest4 {

	public void testClearTrip() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		WebElement from=driver.findElement(By.id("FromTag"));
		
		
		Actions act1=new Actions(driver);
		act1.keyDown(from,Keys.SHIFT).perform();
		Thread.sleep(2000);
		act1.sendKeys("hyd").perform();
		Thread.sleep(2000);
		act1.keyUp(Keys.SHIFT);
		Thread.sleep(2000);
		//act1.sendKeys(Keys.DOWN);
		act1.sendKeys(Keys.ENTER).perform();
		
		WebElement to=driver.findElement(By.id("ToTag"));
		to.sendKeys("bang");
		
		WebElement ul=driver.findElement(By.id("ui-id-2"));
		List<WebElement> list=ul.findElements(By.tagName("li"));
		
		for(WebElement e:list)
		{
			String city=e.getText();
			if(city.contains("BKK"))
			{
				e.click();
				break;
			}
		}
		
		
				
		
		
		
		
		
		
	}
	
	
}
