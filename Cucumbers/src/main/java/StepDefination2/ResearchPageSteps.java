package StepDefination2;



import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ResearchPage;

public class ResearchPageSteps extends TestBase {
	
	HomePage hmpage;
	ResearchPage research;
	
	@When("^user click on Research tab$")
	public void user_click_on_Research_tab() throws Throwable {
		hmpage=new HomePage();
		research=hmpage.clickOnResearch();
	}

	@Then("^user is on Research page$")
	public void user_is_on_Research_page() throws Throwable {
	    research.validateTitle();
	}

	@Then("^user verifies all links of research page$")
	public void user_verifies_all_links_of_research_page() throws Throwable {
	   research.verifyAllElements();
	}

	@Then("^user verifies all research headings$")
	public void user_verifies_all_research_headings() throws Throwable {
	 research.verifyAllHeadings();
	}
}
