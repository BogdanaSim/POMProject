package com.evozon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainMenuPage extends BasePage {

    public MainMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "nav#nav ol.nav-primary li.level0")
    List<WebElement> menuOptions;

    public void clickOption(String nameOption) {
        Optional<WebElement> option=menuOptions.stream().filter(op -> (op.getText().equalsIgnoreCase(nameOption))).findFirst();
        option.ifPresent(WebElement::click);
    }


}
