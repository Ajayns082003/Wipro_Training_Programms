package Handling_Different_Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RadioButtonTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
    }

    @Test
    public void testRadioButton() {
        driver.switchTo().frame("iframeResult");
        WebElement radioMale = driver.findElement(By.xpath("//input[@value='male']"));
        radioMale.click();
        driver.switchTo().defaultContent();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
