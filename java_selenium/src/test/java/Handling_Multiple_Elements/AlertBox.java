package Handling_Multiple_Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox {
	@Test
	public void handleAlertTest() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	    // Click the button to open alert
	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

	    // Switch to Alert
	    Alert alert = driver.switchTo().alert();

	    // Get alert text
	    System.out.println("Alert Text: " + alert.getText());

	    // Accept alert
	    alert.accept();

	    // For dismissing:
	    // alert.dismiss();

	    // For sending input (prompt):
	    // alert.sendKeys("Test Input");
	}


}
