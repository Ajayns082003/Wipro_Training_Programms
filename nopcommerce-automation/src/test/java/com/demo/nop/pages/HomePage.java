package com.demo.nop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Books") WebElement booksMenu;
    @FindBy(className = "ico-logout") WebElement logout;

    public void goToBooks() { booksMenu.click(); }
    public void logout() { logout.click(); }
}
