package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static Pages.SwitchBetweenCurrenciesPage.dropListElement;
import static Pages.SwitchBetweenCurrenciesPage.productPrice;

public class SD05_SwitchBetweenCurrencies {
    @When("user could select from currency dropdown list")
    public void user_could_select_from_currency_dropdown_list() {
        if (dropListElement().isEnabled() && dropListElement().isDisplayed()) {
            System.out.println("DropList is enabled and visible");
        } else {
            System.out.println("DropList is not visible");
        }

        Select select = new Select(dropListElement());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("verify from currency")
    public void verify_from_currency() {
        SoftAssert productAssert = new SoftAssert();
        String expectedResult = "€";
        for (int i = 0; i < productPrice().size(); i++) {
            productAssert.assertEquals(productPrice().get(i).getText().substring(0, 1), expectedResult, "Error found different currency");
            productAssert.assertAll();
            System.out.println("Right: " + productPrice().get(i).getText());
        }
    }
}
