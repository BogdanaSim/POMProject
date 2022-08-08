package com.evozon.Tests;

import com.evozon.Helpers.Constants;
import com.evozon.Pages.MainMenuPage;
import org.junit.Assert;
import org.junit.Test;

public class MainMenuTests extends BaseTests{
    MainMenuPage mainMenuPage;

    @Test
    public void navigateTo(){
        mainMenuPage=new MainMenuPage(driver);
        mainMenuPage.clickOption(Constants.OPTION);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(Constants.OPTION));
    }
}
