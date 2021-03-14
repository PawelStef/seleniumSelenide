package com.cropp.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;
import com.cropp.pages.CroppPage;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class OrderProductTest {

//    "Use case to automate:
//            1. go to https://www.cropp.com/pl/pl/
//            2. select menu ""Kobeta""
//            3. select sub-menu ""Swetry""
//            4. select first Product on the page"

    //Tests
    @Test
    public void clickAroundTest() {
        CroppPage page = new CroppPage();
        //page.openCroppSite();
        page.checkUrl("https://www.cropp.com/pl/pl/");
        //page.selectMenuOption("Kobieta");
        //page.selectSubMenuOption("Swetry");
        page.checkUrl("https://www.cropp.com/pl/pl/dziewczyna/clothes/swetry");
        page.selescProductByIndex(0);
        page.checkProductSelection("Sweter");
        page.selecteSize("S");
        page.checkSize("S");
    }

    @Test
    public void smokeTest() {
        CroppPage page = new CroppPage();
        //page.openCroppSite();
        //page.selectMenuOption("Mężczyzna");
       // page.selectSubMenuOption("Spodnie");
        page.checkUrl("https://www.cropp.com/pl/pl/chlopak/clothes/spodnie");
        page.selescProductByIndex(2);
        page.checkProductSelection("Spodnie");
    }

}
