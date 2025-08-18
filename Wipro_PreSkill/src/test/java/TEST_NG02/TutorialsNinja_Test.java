package TEST_NG02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Random;

public class TutorialsNinja_Test {

    WebDriver driver;
    String baseUrl = "https://tutorialsninja.com/demo/";
    String email;
    String password = "Test@123";

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void registerAccount() {
        driver.get(baseUrl);

      
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Register")).click();

       
        email = "testuser" + new Random().nextInt(10000) + "@mail.com";

       
        driver.findElement(By.id("input-firstname")).sendKeys("Test");
        driver.findElement(By.id("input-lastname")).sendKeys("User");
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).sendKeys(password);
        driver.findElement(By.name("agree")).click();

     
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

       
        String successMsg = driver.findElement(By.cssSelector("#content h1")).getText();
        Assert.assertEquals(successMsg, "Your Account Has Been Created!", "Registration failed!");
    }

    @Test(priority = 2, dependsOnMethods = {"registerAccount"})
    public void loginAccount() {
        
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Logout")).click();

        
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();

        
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        
        WebElement accountHeader = driver.findElement(By.xpath("//h2[contains(text(),'My Account')]"));
        Assert.assertTrue(accountHeader.isDisplayed(), "Login failed!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
