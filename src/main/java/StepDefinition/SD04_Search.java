package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static Pages.SearchFunctionPage.*;
import static StepDefinition.Hook.driver;

public class SD04_Search {

    public static String store = "";

    @When("user click on search field")
    public void user_click_on_search_field() {
        clickOnSearchField().click();
    }

    @When("type {string} in the search textBox")
    public void search_textBox(String searchTerm) {
        typeSentance().sendKeys(searchTerm);
        store = searchTerm;
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        clickSearchButton().click();
    }

    @Then("user could find relative results")
    public void user_could_find_relative_results() {
        List<WebElement> results = relativeResult();
        for (int i = 0; i < results.size(); i++) {
            Assert.assertTrue(results.get(i).getText().toLowerCase().contains(store), "Search result validation failed at instance [ + i + ].");
            System.out.println(results.get(i).getText());
        }
    }

    @Then("user could find {string}")
    public void user_could_find(String expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        String actual = driver.findElement(By.cssSelector("div[class=\"details\"]")).getText();
        softAssert.assertTrue(actual.contains(expectedResult), "Not found product");
        softAssert.assertAll();
    }

}
