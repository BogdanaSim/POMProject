package com.evozon.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "p.welcome-msg")
    WebElement welcomeHeader;

    public String getWelcomeText() {
        return welcomeHeader.getText();
    }


    public void verifyCorrectnessUsername(String username) {
        String extractedUsername = getWelcomeText().substring(getWelcomeText().indexOf(" ") + 1);
        extractedUsername = extractedUsername.substring(0, extractedUsername.length() - 1);
        Assert.assertTrue(extractedUsername.equalsIgnoreCase(username));
    }
}
