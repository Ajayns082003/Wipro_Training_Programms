package com.demo.nop.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

public class WebHelpers {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebHelpers(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void handleAlert(boolean accept) {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            if (accept) alert.accept(); else alert.dismiss();
        } catch (TimeoutException ignored) {}
    }

    public void selectFromDropdown(WebElement element, String visibleText) {
        new Select(element).selectByVisibleText(visibleText);
    }

    public void switchToFrame(WebElement iframe) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public void switchToNewWindow() {
        String current = driver.getWindowHandle();
        for (String h : driver.getWindowHandles()) {
            if (!h.equals(current)) {
                driver.switchTo().window(h);
                break;
            }
        }
    }

    public void pickDateByJs(WebElement input, String yyyyMmDd) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1]", input, yyyyMmDd);
    }

    public void scrollIntoView(WebElement el) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
    }

    public void hover(WebElement el) {
        new Actions(driver).moveToElement(el).perform();
    }
}
