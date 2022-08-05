package com.evozon.Tests;

import com.evozon.Helpers.Constants;
import com.evozon.Pages.HeaderPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeaderTests extends BaseTests {

    private static HeaderPage headerPage;


    @Test
    public void changeLanguageTest() {
        headerPage = new HeaderPage(driver);
        headerPage.changeToNextLanguage();
        Assert.assertEquals(headerPage.getSelectedLanguage().getText(), Constants.LANGUAGE);
    }
}
