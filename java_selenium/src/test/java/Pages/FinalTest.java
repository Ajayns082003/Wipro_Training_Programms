package Pages;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FinalTest extends BaseTest {

    @Test
    @Parameters({"email", "password"})
    public void loginWithValidCredentials(String email, String password) {
        // Navigate directly to login page (keeps it to just "login page" usage)
        driver.get(baseUrl + "login");

        DemoLogin loginPage = new DemoLogin(driver);
        loginPage.login(email, password);

        String actual = loginPage.getLoggedInUserEmail();
        Assert.assertEquals(
                actual, email,
                "Login failed! Expected account email to match input."
        );
    }
}

