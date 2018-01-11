package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class ValidLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication("admin", "manager");
		Thread.sleep(5000);
		
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		ep.logoutFromApplication();
		
		Thread.sleep(5000);
		
		lp.loginToApplication("admin", "manager");
		
	}

}
