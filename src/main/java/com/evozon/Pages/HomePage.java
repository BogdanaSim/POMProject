package com.evozon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="div.widget-new-products li.item.last")
    private List<WebElement> newProducts;


    public int getNumberNewProducts(){
        return newProducts.size();
    }

    public List<WebElement> getNewProducts() {
        return newProducts;
    }
}
