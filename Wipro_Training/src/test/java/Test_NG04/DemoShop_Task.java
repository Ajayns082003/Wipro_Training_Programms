package Test_NG04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Random;

public class DemoShop_Task {

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://demowebshop.tricentis.com/";
    String email;
    String password = "Test@123";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //  Group in testng.xml
    @Test(priority = 1, groups = {"register"})
    public void registerTest() {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Test");
        driver.findElement(By.id("LastName")).sendKeys("User");

        email = "testuser" + new Random().nextInt(10000) + "@mail.com";
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
        String successMsg = driver.findElement(By.className("result")).getText();
        Assert.assertTrue(successMsg.contains("completed"), "Registration failed!");
    }

    // dependsOnGroups example 
    @Test(priority = 2, groups = {"login"}, dependsOnGroups = {"register"})
    public void loginTest() {
        driver.findElement(By.linkText("Log out")).click();
        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
        String accountEmail = driver.findElement(By.className("account")).getText();
        Assert.assertEquals(accountEmail, email, "Login failed!");
    }

    
    //Smoke testing group 
    @Test(priority = 3, groups = {"smoke"})
    public void searchProduct() {
        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-title")));
        Assert.assertTrue(driver.findElement(By.className("product-title")).isDisplayed(), "Search failed!");
    }
    

    //  Ignoring test in class file
    @Test(priority = 4, enabled = false) 
    public void wishlistTest() {
        driver.findElement(By.linkText("Wishlist")).click();
        Assert.assertTrue(driver.getTitle().contains("Wishlist"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
