package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static Pages.SelectDifferentCategoriesPage.mainMenuElement;
import static Pages.SelectDifferentCategoriesPage.subMenuElement;
import static StepDefinition.Hook.driver;

public class SD06_SelectDifferentCategories {
    SoftAssert verifyLink = new SoftAssert();

    @Given("user select random category")
    public void user_select_random_category() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenuElement());
        actions.moveToElement(subMenuElement());

        Hook.sleep(20);

        actions.click().build().perform();
    }

    @Then("user should redirected to the page of the selected category")
    public void user_should_redirected_to_the_page_of_the_selected_category() {
        String expectedResult = "https://demo.nopcommerce.com/software";
        verifyLink.assertEquals(driver.getCurrentUrl(), expectedResult, "Wrong Page");
        verifyLink.assertAll();
    }
}
