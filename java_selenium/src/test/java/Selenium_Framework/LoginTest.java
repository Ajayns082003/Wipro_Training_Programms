package Selenium_Framework;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = ExcelUtils.class)
    public void testLogin(String user, String pass) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user, pass);

        // Simple check: title should contain "Demo Web Shop"
        Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"), "Login failed!");
    }
}
