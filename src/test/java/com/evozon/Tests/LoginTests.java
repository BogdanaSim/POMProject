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
        /*Navigate to login URL
         *Perform login
         * Validate correct URL
         * Validate correct user
         * */

        loginPage = new LoginPage(driver);
        headerPage=new HeaderPage(driver);

        loginPage.getLoginPage();
        loginPage.login(Constants.EMAIL, Constants.PASSWORD);
        Assert.assertEquals(Constants.BASE_URL + "/customer/account/", driver.getCurrentUrl());
        headerPage.verifyCorrectnessUsername(Constants.USERNAME);
    }

}
