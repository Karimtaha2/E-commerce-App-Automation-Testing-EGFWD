package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.ResetPasswordPage.*;

public class SD03_ResetPassword {
    @When("user click on forgot password?")
    public void user_click_on_forgot_password() {
        clickOnForgetPassword().click();
    }

    @When("user click on Recover button")
    public void user_click_on_recover_button() {
        clickOnRecoverButton().click();
    }

    @Then("user should see message \"Email with instructions has been sent to you.\"at the top")
    public void user_should_see_message_email_with_instructions_has_been_sent_to_you_at_the_top() {
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(message().getText().contains(expectedResult));
    }
}
