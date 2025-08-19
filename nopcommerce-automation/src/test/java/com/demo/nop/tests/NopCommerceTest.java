package com.demo.nop.tests;

import com.demo.nop.core.Config;
import com.demo.nop.core.DriverManager;
import com.demo.nop.helpers.WebHelpers;
import com.demo.nop.listeners.TestListener;
import com.demo.nop.pages.*;
import com.demo.nop.utils.ExcelUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class NopCommerceTest {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    ProductPage product;
    WebHelpers helper;

 
    @BeforeClass
    @Parameters({"team"})
    public void setup(@Optional("teamA") String team) {
        driver = DriverManager.getDriver();
        driver.get(Config.getUrlForTeam(team));
        helper = new WebHelpers(driver);
    }



    @Test(groups = {"smoke"}, dataProvider = "loginData")
    public void endToEndFlow(String email, String password) {
        login = new LoginPage(driver);
        login.openLoginPage();
        login.setEmail(email);
        login.setPassword(password);
        login.submit();

        home = new HomePage(driver);
        home.goToBooks();

        product = new ProductPage(driver);
        product.openFirstBook();

        product.addToCart();
        helper.handleAlert(true);

        home.logout();
    }

    @DataProvider
    public Object[][] loginData() throws Exception {
        return ExcelUtil.getTestData("Login");
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
