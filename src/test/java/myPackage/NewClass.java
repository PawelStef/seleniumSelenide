package myPackage;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class NewClass {

//    public static void main(String[] args) {
//        System.out.println("Run");
//    }


    @Test
    public void userCanSearch() throws InterruptedException {
        open("https://www.w3schools.com/cssref/css_selectors.asp");
        new GooglePage().searchFor("selenide");
        SearchResultsPage resultsPage = new SearchResultsPage();
        resultsPage.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));

  //      assert("//[@id]");
//        resultsPage.getResult(1).shouldHave(text("Selenide - Concise UI Tests in Java - Methods & Tools"));


//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }

}
