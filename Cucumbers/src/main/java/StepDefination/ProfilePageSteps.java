package StepDefination;



import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.ProfilePage;

public class ProfilePageSteps extends TestBase {

	HomePage hmpage;
	ProfilePage profile;
	
	@When("^user clicks on Profile Tab$")
	public void user_clicks_on_Profile_Tab() throws Throwable {
		hmpage=new HomePage();
		profile=hmpage.clickOnProfile();
	}

	@Then("^user is on Profile Page$")
	public void user_is_on_Profile_Page() throws Throwable {
		String title=profile.verifyTitle();
		   Assert.assertEquals("Customer Profile", title);
	}

	@Then("^user verifies all headings of Profile tab$")
	public void user_verifies_all_headings_of_Profile_tab() throws Throwable {
	 profile.verifyAllHeadings();
	}

	@Then("^user verifies all elements of Profile tab$")
	public void user_verifies_all_elements_of_Profile_tab() throws Throwable {
	   profile.verifyAllElements();
	}

	@Then("^user verifies all fields of Trading Profile$")
	public void user_verifies_all_fields_of_Trading_Profile() throws Throwable {
	    profile.verifyAllFields();
	}


}
