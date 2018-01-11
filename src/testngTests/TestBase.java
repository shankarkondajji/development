package testngTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		Reporter.log("Before Class",true);
		System.setProperty("webdriver.chrome.driver","C:\\Development\\DemoCode\\TestWorkSpace\\ActiTime\\drivers\\chromedriver.exe");
	   // WebDriverWait wait = new WebDriverWait(driver, 10);
		driver = new ChromeDriver();		
	}
	
	@BeforeMethod
	public void setup() {
		    Reporter.log("Before method",true);
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");	
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		Reporter.log("closed the browser",true);
	}
	
	
}
