/**
 * 
 */
package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.basepackage.Baseclass;

/**
 * @author ${Rajasekhara Reddy${19-07-2020${ORANGE HRM}}}
 *
 */
public class testClass extends Baseclass{
	
	
	@Test
	public void testcase3() 
	{
		setup();
		driver.findElement(By.name("q")).sendKeys("ScreenshotDemo");
		//TakeScreenshot.ScreenShot(driver,"Screenshot1");
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void testcase4() 
	{
		setup();
		Assert.assertTrue(false);

		
		//TakeScreenshot.ScreenShot(driver,"Screenshot2");
	
	
	}
	
@AfterTest
	
	public void TearDown()
	{
		driver.quit();
	}

	

}
