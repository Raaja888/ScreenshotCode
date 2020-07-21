package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basepackage.Baseclass;

@Listeners(com.utility.ListenerCkass.class)
public class ScreenShottest extends Baseclass {
	
	@Test
	public void testcase1() 
	{
		setup();
		driver.findElement(By.name("q")).sendKeys("ScreenshotDemo");
		//TakeScreenshot.ScreenShot(driver,"Screenshot1");
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void testcase2() 
	{
		setup();
		Assert.assertTrue(true);

		
		//TakeScreenshot.ScreenShot(driver,"Screenshot2");
	
	
	}
	
@AfterMethod
	
	public void TearDown()
	{
		driver.quit();
	}

}
