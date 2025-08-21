package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
    features = "src/test/resources/features/login.feature",   	// Path to your .feature files "add the file name as well"
    glue = "StepDefinition",                         // Step definitions package
    plugin = {"pretty", "html:target/cucumber-reports.html"},
 // dryRun = true, 			 // checks whether the content or the method is matching or not
    monochrome = true,			 // Make the output more readable 
   // tags = "@smoke" ,
    //tags ="@smoke and @positive",
    tags = "@auth"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
