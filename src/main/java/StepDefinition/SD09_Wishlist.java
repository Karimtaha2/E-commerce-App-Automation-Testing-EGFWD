package StepDefinition;

import Pages.WishlistPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static Pages.WishlistPage.*;
import static StepDefinition.Hook.driver;

public class SD09_Wishlist {
    SoftAssert softAssert = new SoftAssert();

    @When("user click on add to wishlist")
    public void user_click_on_add_to_wishlist() {
        wishlistIcon().click();
        Hook.sleep(20);
    }

    @Then("user select attributes for product if found")
    public void user_select_attributes_for_product_if_found() {
        WishlistPage.selectTypeOfProcessor();
        WishlistPage.selectRam();
        WishlistPage.selectHDD();
        WishlistPage.selectOS();
        WishlistPage.selectSoftware();
    }

    @Then("user should found the product added to wishlist in the wishlist")
    public void user_should_found_the_product_added_to_wishlist_in_the_wishlist() {
        wishlistButton().click();

        String expectedMessage = "The product has been added to your wishlist";
        softAssert.assertTrue(message().getText().contains(expectedMessage), "Not add in wishlist");

        if (message().isDisplayed()) {
            driver.findElement(By.cssSelector(".content > a:nth-child(1)")).click();
            softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/wishlist", "Not ");
            softAssert.assertEquals(driver.findElement(By.cssSelector("a[class=\"product-name\"]")).getText(), "Build your own computer", "Wrong product in wishlist");
            softAssert.assertAll();
            System.out.println("Add product to wishlist successfully");
        }
    }
}
