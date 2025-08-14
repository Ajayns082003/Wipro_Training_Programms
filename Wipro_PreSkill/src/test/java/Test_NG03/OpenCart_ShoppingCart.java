package Test_NG03;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenCart_ShoppingCart{

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void checkEmptyCart() {
       
        driver.get("https://demo.opencart.com/en-gb?route=checkout/cart");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Shopping Cart')]")));

      
        String cartMessage = driver.findElement(By.cssSelector("#content > p")).getText();
        System.out.println("Cart message: " + cartMessage);

       
        if (cartMessage.contains("Your shopping cart is empty!")) {
            System.out.println("Test Passed: Shopping cart is empty.");
        } else {
            System.out.println("Test Failed: Unexpected cart message.");
        }
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
