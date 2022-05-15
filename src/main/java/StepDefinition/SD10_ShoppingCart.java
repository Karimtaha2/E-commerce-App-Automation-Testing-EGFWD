package StepDefinition;

import Pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD10_ShoppingCart {

    @Given("user select a random product")
    public void user_select_a_random_product() {
        ShoppingCartPage.selectProduct().click();
    }

    @When("Click on ADD TO CART button")
    public void click_on_add_to_cart_button() {
        ShoppingCartPage.addToProductButton().click();
    }

    @Then("the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart")
    public void the_product_is_added_to_the_user_s_shopping_cart_and_message_appears_says_the_product_has_been_added_to_your_shopping_cart() {
        SoftAssert wishlistAssertion = new SoftAssert();
        if (ShoppingCartPage.message().isDisplayed()) {
            wishlistAssertion.assertEquals(ShoppingCartPage.message().getText(), "The product has been added to your shopping cart");
            wishlistAssertion.assertEquals(ShoppingCartPage.message().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
            wishlistAssertion.assertAll();
            System.out.println("Add product to shopping cart successfully");
        }
    }

}
