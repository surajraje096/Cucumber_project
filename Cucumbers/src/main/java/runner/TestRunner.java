package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "D:\\SpringBoot API Projects\\Cucumbers\\src\\main\\java\\Features\\sharekhan.feature",

		glue = {"StepDefination"},

		monochrome =false,

		strict = true,

		dryRun = false)

public class TestRunner {

}
 