package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/flipkart.feature", // path of feature file
    glue = "StepDefinition",                                   // package of step defs
    plugin = {
        "pretty", 
        "html:target/cucumber-reports/flipkart-report.html",   // HTML report
    },
    monochrome = true,       // readable console output
    tags = "@flipkart" 
    //tags = "@positive"  // control execution by tags
)
public class TestRunner1 extends AbstractTestNGCucumberTests {
}

