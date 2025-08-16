package Handling_Multiple_Elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {

	@Test
	public void handleMultipleWindowsTest() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/windows");

	    // Click to open new tab
	    driver.findElement(By.linkText("Click Here")).click();

	    // Get all window handles
	    Set<String> windows = driver.getWindowHandles();// VERY IMPORTANT CONCEPT
	    Iterator<String> it = windows.iterator();

	    String parentWindow = it.next();
	    String childWindow = it.next();

	    // Switch to child window
	    driver.switchTo().window(childWindow);
	    System.out.println("Child Window Title: " + driver.getTitle());

	    // Close child and switch back
	    driver.close();
	    driver.switchTo().window(parentWindow);
	}

}
