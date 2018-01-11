package com.autodesk;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	@BeforeMethod
	public void beforeMethod()
	{
		//login to app
		Reporter.log("before method...",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//logout
		Reporter.log("after method..",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		//launch browser
		Reporter.log("before class..",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		//close browser
		Reporter.log("after class..",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("before test..",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after test..",true);
	}
	
	@BeforeSuite
	public void beforesuit()
	{
		Reporter.log("before suit...",true);
	}
	
	@AfterSuite
	public void afterSuit()
	{
		Reporter.log("after suit,..",true);
	}
}
