package com.evozon.Tests;

import com.evozon.Helpers.Constants;
import com.evozon.Pages.CategoryPage;
import com.evozon.Pages.HeaderPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderTests extends BaseTests {

    private static HeaderPage headerPage;
    private static CategoryPage categoryPage;


    @Test
    public void changeLanguageTest() {
        headerPage = new HeaderPage(driver);
        headerPage.changeToNextLanguage();
        Assert.assertEquals(headerPage.getSelectedLanguage().getText(), Constants.LANGUAGE);
    }

    @Test
    public void search() {
        //test fails because the products title in the search result should have something similar with the keyword
        headerPage = new HeaderPage(driver);
        headerPage.search(Constants.KEY_WORD);
        categoryPage = new CategoryPage(driver);
        List<WebElement> webElementList = categoryPage.getProducts();
        Assert.assertTrue(webElementList.size() > 0);
        for (WebElement element2 : webElementList) {
            String s = element2.getText().split("\n")[0];
            Assert.assertTrue(s.toLowerCase().contains(Constants.KEY_WORD));
        }

    }
}
