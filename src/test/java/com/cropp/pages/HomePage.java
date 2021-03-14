package com.cropp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public void openCroppSite() {
        open("https://www.cropp.com/pl/pl/");
    }

    public void selectMenuOption(String option) {
        Selenide.$$(".menu>li>a").find(Condition.text(option)).click();
    }

    public void selectSubMenuOption(String option) {
        Selenide.$$(".menu>li>ul>li>ul>li>a").find(Condition.text(option)).click();
    }
}
