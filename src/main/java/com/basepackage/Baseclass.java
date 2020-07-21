package com.basepackage;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}


	
	public  void ScreenShot(String filename ) 
	
	{
		
		String Date = new SimpleDateFormat("ddMMyyyHHmmss").format(new Date(0));
	TakesScreenshot takescreenshot = (TakesScreenshot) driver;
	
// this is just for git chnage confirmation
	File source= 	takescreenshot.getScreenshotAs(OutputType.FILE);
	try 
	{
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "\\Screenshots\\"+ filename+"_ " + Date + " .png"));
	} 
	catch (Exception e) 
	{
		e.getMessage();
	}
	}
	// this is just for git chnage confirmation

}
