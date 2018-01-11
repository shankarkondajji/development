package com.autodesk;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB
{
	@Test
	public void registerUser()
	{
		Reporter.log("register...",true);
	}
	
	@Test
	public void editUser()
	{
		Assert.fail();
		Reporter.log("edit...",true);
	}
	
	@Test(dependsOnMethods={"registerUser","editUser"})
	public void deleteUser()
	{
		Reporter.log("delete..",true);
	}
}
