package StepDefination;



import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ReportsPage;

public class ReportPageSteps extends TestBase {

	HomePage hmpage;
	ReportsPage report; 
	
	@When("^user clicks on Reports Tab$")
	public void user_clicks_on_Reports_Tab() throws Throwable {
	    hmpage=new HomePage();
	    report=hmpage.clickOnReports();
	}

	@Then("^user is on Reports Page$")
	public void user_is_on_Reports_Page() throws Throwable {
	  report.verifyTitle();
	}
	@Then("^user verifies all report links$")
	public void user_verifies_links() throws Throwable {
		report.verifyAllReportsLinks();
	}
	@Then("^user verifies all headings of Report Page$")
	public void user_verifies_all_headings_of_Report_Page() throws Throwable {
	 report.verifyAllHeadings();
	}

	@Then("^user verifies all elements of Report Page$")
	public void user_verifies_all_elements_of_Report_Page() throws Throwable {
	   report.verifyAllElements();
	}
	
}
