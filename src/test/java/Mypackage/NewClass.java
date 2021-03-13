package Mypackage;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class NewClass {

//    public static void main(String[] args) {
//        System.out.println("Run");
//    }


    @Test
    public void userCanSearch() {
        open("https://www.google.com/");
        new GooglePage().searchFor("selenide");
        SearchResultsPage resultsPage = new SearchResultsPage();
        resultsPage.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));


//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }

}
