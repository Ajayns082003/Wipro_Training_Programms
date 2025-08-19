package Handling_Multiple_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	public void handleIframesTest() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/iframe");

	    // Switch to iframe by WebElement
	    WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
	    driver.switchTo().frame(iframe);

	    // Interact with element inside iframe
	    WebElement textBox = driver.findElement(By.id("tinymce"));
	    textBox.clear();
	    textBox.sendKeys("Hello, TestNG with IFrame!");

	    // Switch back to main page
	    driver.switchTo().defaultContent();
	}


}
