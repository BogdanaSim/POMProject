package com.evozon.Tests;

import com.evozon.Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class HomePageTests extends BaseTests{
    public HomePage homePage;

    @Test
    public void testNewProducts(){
        homePage=new HomePage(driver);
        String[] array = {
                "LINEN BLAZER", "ELIZABETH KNIT TOP", "CHELSEA TEE", "LAFAYETTE CONVERTIBLE DRESS",
                "TORI TANK"};
        List<String> namesNewProducts = new ArrayList<>();
        int numberNewProducts=homePage.getNumberNewProducts();
        Assert.assertEquals(5,numberNewProducts);
        List<WebElement> newProducts=homePage.getNewProducts();
        for (WebElement element : newProducts) {
            String s = element.getText().split("\n")[0];
            namesNewProducts.add(s);

        }
        Assert.assertArrayEquals(namesNewProducts.toArray(),array);
    }
}
