package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class LogOutPage extends TestBase{

	public LogOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	
	public HomePage logoutclick()
	{
		logout.click();
		return new HomePage();
		
	}

	
	
	public void closeBrowser()
	{
		
		driver.quit();
	}

	public HomePage LogOutPage() {
		// TODO Auto-generated method stub
		return new HomePage();
	}
}
