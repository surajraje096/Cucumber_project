package StepDefination2;



import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.MutualFundPage;

public class MutualFundsPageSteps extends TestBase{
	
	HomePage hmpage;
	MutualFundPage mutual;
	
	@When("^user clicks on Mutual Funds tab$")
	public void user_clicks_on_Mutual_Funds_tab() throws Throwable {
	   hmpage=new HomePage();
	   mutual=hmpage.clickOnMutualFunds();
	}

	@Then("^user is on Mutual Funds page$")
	public void user_is_on_Mutual_Funds_page() throws Throwable {
		try{
		    mutual.validateTitle();
		}catch(Throwable t)
		{
			TestBase.collector.addError(t);
		}
	}

	@Then("^user verifies links of page$")
	public void user_verifies_links_of_page() throws Throwable {
	   mutual.verifyLinks();
	}

	@Then("^user veries elements of page$")
	public void user_veries_elements_of_page() throws Throwable {
	   mutual.verifyAllElements();
	}



}
