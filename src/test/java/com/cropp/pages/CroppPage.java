package com.cropp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class CroppPage {







    public void checkUrl(String url) {
        Assert.assertEquals(url, WebDriverRunner.url());
    }

    public void selescProductByIndex(int i) {
        Selenide.$$(".es-product").get(i).click();
    }

    public void checkProductSelection(String produktName) {
        Selenide.$(".product-name").shouldHave(Condition.text(produktName));
    }

    public void selecteSize(String size) {
        Selenide.$(".size-selected").click();
        Selenide.$$("[data-selen=size]").find(Condition.text(size)).click();
    }

    public void checkSize(String size) {
        Selenide.$(".size-selected").click();
        Selenide.$(".selected>span").shouldHave(Condition.text(size));
    }

}
