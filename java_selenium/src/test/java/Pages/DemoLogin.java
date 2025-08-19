package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLogin {
    private final WebDriver driver;

    // Locators (no XPath used)
    private final By emailField   = By.id("Email");
    private final By passwordField= By.id("Password");
    private final By loginButton  = By.cssSelector("input.button-1.login-button");
    private final By accountEmail = By.className("account");

    public DemoLogin(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

    public String getLoggedInUserEmail() {
        return driver.findElement(accountEmail).getText();
    }
}
