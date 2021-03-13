package w3school;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

//"we'll create small test to click around w3school site.
//    Here is a flow to automate:
//            1. go to ""https://www.w3schools.com/cssref/css_selectors.asp""
//            2. close Cookies pop-up(accept it)
// 2a. assert page is displayed
// 3. in left menu navigate to ""CSS Functions""
//            3a. assert page header is ""CSS Function""
//            4. select item from top menu: ""JavaScript""
//            5.add line to assert the url of the page is as expected"

public class FirstTest {

    @Test
    public void clickAroundOfw3school() {
        open("https://www.w3schools.com/cssref/css_selectors.asp");
        acceptCookies();
        checkUrl("https://www.w3schools.com/cssref/css_selectors.asp");
        checkTitule("CSS Selectors");
        changeTopic("CSS Functions");
        checkTitule("CSS Functions");
        checkUrl("https://www.w3schools.com/cssref/css_functions.asp");

    }

    private void acceptCookies() {
        Selenide.$("#accept-choices").click();
    }

    private  void changeTopic(String title){
        Selenide.$$("#leftmenuinnerinner>a").find(Condition.text(title)).click();
    }

    private void checkTitule(String titule) {
        Selenide.$("#main h2").shouldHave(Condition.text(titule));
    }

    private void checkUrl(String url){
        Assert.assertEquals(url, WebDriverRunner.url());
    }

}
