package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "featureFiles/",
glue= {"stepDefinitions", "hooks"}, dryRun = true , stepNotifications = true , monochrome = false,
plugin = {"html:report/webReport","json:report/jsonReportFile.json", 
		"junit:report/xmlReport.xml"},
	tags = "@BackgroundExample"
)

public class Runner {
	
	//It should be combine feature file and step definition
	// Runner Define
	
	

}
