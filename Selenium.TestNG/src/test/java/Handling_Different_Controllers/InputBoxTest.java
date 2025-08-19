package Handling_Different_Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class InputBoxTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_forms.asp");
    }

    @Test
    public void testInputBox() {
        WebElement inputBox = driver.findElement(By.id("fname"));
        inputBox.clear();
        inputBox.sendKeys("Ajay NS");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

