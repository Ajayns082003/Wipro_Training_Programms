package com.demo.nop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".product-item .product-title a") WebElement firstBook;
    @FindBy(id = "add-to-cart-button-13") WebElement addToCartBtn;

    public void openFirstBook() { firstBook.click(); }
    public void addToCart() { addToCartBtn.click(); }
}
