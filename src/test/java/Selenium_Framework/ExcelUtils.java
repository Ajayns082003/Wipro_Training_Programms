package Selenium_Framework;

import org.testng.annotations.DataProvider;

public class ExcelUtils {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"testuser1@gmail.com", "password1"},
            {"wronguser@gmail.com", "wrongpass"}
        };
    }
}
