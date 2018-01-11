package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	//Declaration
//	 WebDriverWait wait;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	WebElement login;
	
	@FindBy(id="logoutLink")
	WebElement logout;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//  wait = new WebDriverWait(driver, 10);
	}
	
	//Utilization
	public void loginToApplication(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout")));
	}
}
