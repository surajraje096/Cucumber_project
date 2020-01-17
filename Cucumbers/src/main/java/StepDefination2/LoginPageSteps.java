package StepDefination2;

import java.io.IOException;

import org.junit.Assert;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps extends TestBase{
	
	LoginPage login;

	
	@Given("^user opens browser$")
	public void user_opens_browser() throws IOException
	{
		inti();
	}
	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	 
		login = new LoginPage();
		String expected="Sharekhan Online Trading Account Login";
		String actual=login.validateTitle();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	
	}
	@Then("^user validates sharekhan logo$")
	public void user_validates_sharekhan_logo() throws Throwable {
	  boolean b= login.validateLogo();
	  Assert.assertTrue(b);
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
		   login.enterUsername(pro.getProperty("username"));
		  
		   login.clickOnNext2();
		   Thread.sleep(5000);
	}

	@Then("^user clicks on next button$")
	public void user_clicks_on_next_button() throws Throwable {
		login.clickOnNext();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
	 login.enterPassword(pro.getProperty("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		login.clickOnLogin();
	}
	
	
}
