package Handling_Multiple_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Darg_and_Drop {
	@Test
	public void handleDragAndDropTest() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));

	    Actions actions = new Actions(driver);
	    actions.dragAndDrop(source, target).perform();

	    Assert.assertEquals(target.getText(), "Dropped!");
	}

}
