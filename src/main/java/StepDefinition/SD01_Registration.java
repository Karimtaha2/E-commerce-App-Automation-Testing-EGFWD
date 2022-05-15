package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.RegisterPage.*;
import static StepDefinition.Hook.*;

public class SD01_Registration {
    @When("user clicked on Register tab")
    public void user_clicked_on_register_tab() {
        registerLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/register?returnUrl=%2F", "Wrong Registration Link");
        Hook.sleep(20);
    }

    @When("user select gender {string}")
    public void user_select_gender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            genderMale().click();
        }
        if (gender.equalsIgnoreCase("female")) {
            genderFemale().click();
        }
    }

    @When("user enter first name {string}")
    public void user_enter_first_name(String firstname) {
        firstName().clear();
        firstName().sendKeys(firstname);
    }

    @When("user enter last name {string}")
    public void user_enter_last_name(String lastname) {
        lastName().clear();
        lastName().sendKeys(lastname);
    }

    @When("user selected birth of date {string}")
    public void user_selected_birth_of_date(String dateOfBirth) {
        String[] dateField = dateOfBirth.split("/");

        dateOfBirthDay().selectByValue(dateField[0]);
        dateOfBirthMonth().selectByValue(dateField[1]);
        dateOfBirthYear().selectByValue(dateField[2]);
    }

    @When("user enter company name {string}")
    public void user_enter_company_name(String companyName) {
        enterCompanyName().sendKeys(companyName);
    }

    @When("user select Newsletter option {string}")
    public void user_select_newsletter_option(String option) {
        boolean isDisplayed = newsletterOption().isSelected();
        if (option.equalsIgnoreCase("true") && isDisplayed == false) {
            newsletterOption().click();
            System.out.println("Newsletter: " + option);
        } else if (option.equalsIgnoreCase("false") && isDisplayed == true) {
            newsletterOption().click();
            System.out.println("Newsletter: " + option);
        } else
            System.out.println("Newsletter: " + option);

        Hook.sleep(20);
    }

    @When("user enter confirm password")
    public void user_enter_confirm_password() {
        enterConfirmPassword().sendKeys(validPassword);
    }

    @When("user clicked on REGISTER button")
    public void user_clicked_on_register_button() {
        clickRegisterButton().click();
        Hook.sleep(20);
    }

    @Then("user should login successfully and see Log out tab in the header website")
    public void user_should_see_log_out_link_in_the_header_website() {
        verifyRegistration.assertTrue(logoutLink().isDisplayed(), "Registration Process Failed_2");
        verifyRegistration.assertAll();
        isRegister = true;
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String expectedResult) {
        String actualResult = message().getText();
        verifyRegistration.assertTrue(actualResult.contains(expectedResult), "Registration Process Failed_1");
        verifyRegistration.assertAll();
        clickContinueButton().click();
    }
}