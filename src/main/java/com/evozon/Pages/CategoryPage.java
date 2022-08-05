package com.evozon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends  BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="ul.products-grid li.item.last")
    private List<WebElement> gridProducts;

    public List<WebElement> getProducts(){
        return gridProducts;
    }
}
