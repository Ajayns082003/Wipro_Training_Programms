package StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Runs before every Scenario");
    }

    @After
    public void afterScenario() {
        System.out.println(" Runs after every Scenario");
    }

   
    @BeforeStep
    public void beforeEachStep() {
        System.out.println("Runs before every step");
    }

    @AfterStep
    public void afterEachStep() {
        System.out.println("Runs after every step");
    }
    
    
    //combination of Tags and Hooks
//    @Before("@smoke")
//    public void Before() {
//    	System.out.println("Excute all test scenario");
//    }
//    
//    @After("@smoke")
//    public void After() {
//    	System.out.println("Excute all test scenario");
//    }
//    
//    
//    @Before("@smoke and positive")
//    public void Before1() {
//    	System.out.println("Excute all test scenario");
//    }
//    
//    @After("@smoke and positive")
//    public void After2() {
//    	System.out.println("Excute all test scenario");
//    }
}
