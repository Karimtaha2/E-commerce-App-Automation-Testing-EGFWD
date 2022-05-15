package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static Pages.LoginPage.*;
import static StepDefinition.Hook.*;

public class SD02_Login {
    public static SoftAssert verifyLogin = new SoftAssert();

    @Given("user had a valid registered account")
    public void user_had_a_valid_registered_account() {
        Assert.assertTrue(!(validEmail.isEmpty() && isRegister), "There's no valid account registered yet");
    }

    @When("user clicked on Log in tab in the header website")
    public void user_clicked_on_log_in_tab_in_the_header_website() {
        clickLoginTab().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/login?returnUrl=%2F", "Wrong Log In Link");
        Hook.sleep(20);
    }

    @And("user enter email address in login page")
    public void userEnterEmailAddressInLoginPage() {
        enterEmailAddress().sendKeys(validEmail);
    }

    @When("user clicked on Log in button")
    public void user_clicked_on_log_in_button() {
        clickLoginButton().click();
        Hook.sleep(20);
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        String expectedResult = "https://demo.nopcommerce.com/";
        verifyLogin.assertEquals(driver.getCurrentUrl(), expectedResult, "Login Process Failed_1");
        verifyLogin.assertTrue(seeMyAccountTab().isDisplayed(), "Login Process Failed_2");
        verifyLogin.assertAll();
    }

}
