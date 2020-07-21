package com.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.basepackage.Baseclass;

public class ListenerCkass extends Baseclass implements  ITestListener{
	
	
	public void onTestStart(ITestResult result)
	{
		
	}

	
	public void onTestSSuccess(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		ScreenShot(result.getName());
	}
	
	public void onTestfailure(ITestResult result)
	{
		
	}
	public void onTestfailedButWithinTheSuccessPercentage(ITestResult result)
	{
		
	}
	
}
