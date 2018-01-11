package com.autodesk;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA
{
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("login...",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("logout...",true);
	}
	
	@Test(priority=1,groups={"user","smoke"})
	public void createUser()
	{
		Reporter.log("user created...",true);
	}
	
	@Test(priority=2,groups="user",enabled=false)
	public void editUser()
	{
		Reporter.log("edit user..",true);
	}
	
	@Test(priority=3,groups="user")
	public void deleteUser()
	{
		Reporter.log("delete user...",true);
	}
	
	@Test(priority=4,groups= {"task","smoke"})
	public void createTask()
	{
		Reporter.log("task created...",true);
	}
	
	@Test(priority=5,groups="task")
	public void editTask()
	{
		Reporter.log("edit task..",true);
	}
	
	@Test(priority=6,groups="task")
	public void deleteTask()
	{
		Reporter.log("delete task...",true);
	}
}
