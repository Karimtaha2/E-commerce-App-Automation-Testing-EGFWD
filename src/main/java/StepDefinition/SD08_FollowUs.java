package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Pages.FollowUsPage.openTab;
import static Pages.FollowUsPage.switchTab;
import static StepDefinition.Hook.driver;

public class SD08_FollowUs {

    @Given("user scroll down")
    public void user_scroll_down() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("ul[class=\"networks\"]"));
        scroll.executeScript("arguments[0].scrollIntoView();", element);
        Hook.sleep(20);
    }

    @When("user clicked on icons link")
    public void user_clicked_on_icons_link() {
        openTab();
    }

    @Then("user can switch between pages")
    public void user_can_switch_between_pages() {
        switchTab();
    }
}