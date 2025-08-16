package Handling_Multiple_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	@Test
	public void handleDatePickerTest() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/datepicker/");
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	    // Click date field
	    driver.findElement(By.id("datepicker")).click();

	    // Select specific date 
	    driver.findElement(By.xpath("//a[text()='15']")).click();
	}

}
