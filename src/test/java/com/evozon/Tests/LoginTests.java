package com.evozon.Tests;

import com.evozon.Helpers.Constants;
import com.evozon.Pages.HeaderPage;
import com.evozon.Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends BaseTests {

    LoginPage loginPage;
    HeaderPage headerPage;

    @Test
    public void loginTest() {

        loginPage = new LoginPage(driver);
        headerPage=new HeaderPage(driver);
        loginPage.getLoginPage();
        loginPage.login(Constants.EMAIL, Constants.PASSWORD);
        String welcomeText=headerPage.getWelcomeText();
        String extractedUsername = welcomeText.substring(welcomeText.indexOf(" ") + 1);
        extractedUsername = extractedUsername.substring(0, extractedUsername.length() - 1);
        Assert.assertTrue(extractedUsername.equalsIgnoreCase(Constants.USERNAME));
    }

}
