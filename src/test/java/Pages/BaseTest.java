package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected final String baseUrl = "https://demowebshop.tricentis.com/";

    @BeforeClass
    public void setUp() {
        // If needed, set driver path here via System.setProperty(...)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Small implicit wait for stability (kept minimal)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
