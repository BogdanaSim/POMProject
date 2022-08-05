package com.evozon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage extends BasePage {


    public HeaderPage(WebDriver driver) {
        super(driver);
        selectLanguages = new Select(languages);

    }

    @FindBy(css = "p.welcome-msg")
    WebElement welcomeHeader;

    @FindBy(css = ".account-cart-wrapper a")
    WebElement accountHeaderButton;

    @FindBy(css = "select#select-language")
    WebElement languages;

    private Select selectLanguages;

    public String getWelcomeText() {
        return welcomeHeader.getText();
    }


    public void clickAccountHeader() {
        accountHeaderButton.click();
    }

    public void changeToNextLanguage() {
        //Select selectLanguages=new Select(languages);
        selectLanguages.selectByIndex(1);
    }

    public WebElement getSelectedLanguage() {

        return selectLanguages.getFirstSelectedOption();
    }


}
