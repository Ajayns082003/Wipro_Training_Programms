package com.demo.nop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-login") WebElement loginLink;
    @FindBy(id = "Email") WebElement email;
    @FindBy(id = "Password") WebElement password;
    @FindBy(css = "button.login-button") WebElement loginBtn;

    public void openLoginPage() { loginLink.click(); }
    public void setEmail(String value) { email.clear(); email.sendKeys(value); }
    public void setPassword(String value) { password.clear(); password.sendKeys(value); }
    public void submit() { loginBtn.click(); }
}
