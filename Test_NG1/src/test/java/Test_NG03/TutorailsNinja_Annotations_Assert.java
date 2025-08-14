package Test_NG03;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class TutorailsNinja_Annotations_Assert {
    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://tutorialsninja.com/demo/";
    String firstName = "Ajay";
    String lastName = "NS";
    String email = "ajay" + System.currentTimeMillis() + "@mail.com"; // unique email
    String password = "Test@123";

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("=== Start of the Test Suite ===");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Preparing the TutorialsNinja test environment");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Launching the browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Opening TutorialsNinja homepage");
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void verifyHomePage() {
        String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        System.out.println("Verifying homepage title");
        Assert.assertEquals(actualTitle, expectedTitle, "Homepage title mismatch");
    }

    @Test(priority = 2)
    public void registerAccount() {
        System.out.println("Registering new account");

        
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();

      
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname"))).sendKeys(firstName);
        driver.findElement(By.id("input-lastname")).sendKeys(lastName);
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).sendKeys(password);

        
        driver.findElement(By.name("agree")).click();

     
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

      
        wait.until(ExpectedConditions.titleContains("Your Account Has Been Created!"));
        Assert.assertTrue(driver.getTitle().contains("Account Has Been Created"), "Registration failed");

       
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    @Test(priority = 3)
    public void loginTest() {
        System.out.println("Logging into existing account");

      
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys(password);

       
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        
        Assert.assertTrue(driver.getTitle().contains("My Account"), "Login failed");

       
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Test completed - Navigating back to homepage");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Closing the browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("=== After Test Phase ===");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("=== End of the Test Suite ===");
    }
}
