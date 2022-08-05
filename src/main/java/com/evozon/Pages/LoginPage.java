package com.evozon.Pages;

import com.evozon.Helpers.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    private WebDriver driver;
    private final String PATH="/customer/account/login/";

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css="#email")
    private WebElement emailInput;


    @FindBy(css="#pass")
    private WebElement passInput;

    @FindBy(css="div.account-login button[title=\"Login\"]")
    private WebElement loginButton;

    public void getLoginPage(){
        getDriver().get(Constants.BASE_URL+PATH);

    }

    public void login(String email,String password){
        emailInput.sendKeys(email);
        passInput.sendKeys(password);
        loginButton.click();
    }



}
