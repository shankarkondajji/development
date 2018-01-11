package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage
{
	//Declaration
	@FindBy(id="logoutLink")
	WebElement logout;
	
	//Initalization
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void logoutFromApplication()
	{
		logout.click();
	}
}
