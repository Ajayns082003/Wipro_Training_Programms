package Selenium_Framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) {
        driver = DriverManager.getDriver(browser);
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
