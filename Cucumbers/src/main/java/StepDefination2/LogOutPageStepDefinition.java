package StepDefination2;



import base.TestBase;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LogOutPage;

public class LogOutPageStepDefinition extends TestBase{
	
	HomePage hmpage;
	LogOutPage logout;
	
	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
		hmpage=new HomePage();
		hmpage=logout.logoutclick();
		logout.closeBrowser();
		}
	@Then("^user close the browser")
	public void user_close_the_browser()
	{
		logout.logoutclick();
	}
}
