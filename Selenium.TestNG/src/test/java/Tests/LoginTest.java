package Tests;

import Base.BaseTest;
import Page_Factory.LoginPage;
import Page_Factory.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {
        // Step 1: Open login page and enter details
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("john");   // Parabank demo user
        loginPage.enterPassword("demo");   // Parabank demo password
        loginPage.clickLogin();

        // Step 2: Navigate to home page and get welcome text
        HomePage homePage = new HomePage(driver);
        String welcomeText = homePage.getWelcomeText();

        // Step 3: Assert that login is successful
        Assert.assertTrue(welcomeText.contains("Welcome to all"),
            "Login failed - Welcome text not found!");
    }
}
