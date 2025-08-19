package Handling_Different_Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class SelectBoxTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
    }

    @Test
    public void testSelectBox() {
        driver.switchTo().frame("iframeResult");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Saab");
        driver.switchTo().defaultContent();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

