package testngTests;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLoginLogout extends TestBase {

	//public  WebDriver driver;
	

	
	@Test
	 public void LoginTest() throws InterruptedException
	{
		Reporter.log("Test Method",true);
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.loginToApplication("admin", "manager");
		Thread.sleep(10000);
        String title =driver.getTitle();
        assertEquals(title, "actiTIME - Enter Time-Track");
}
}

