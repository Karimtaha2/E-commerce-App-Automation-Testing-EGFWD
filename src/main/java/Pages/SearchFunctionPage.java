package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static StepDefinition.Hook.driver;

public class SearchFunctionPage {
    public static WebElement clickOnSearchField() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement typeSentance() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement clickSearchButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public static List<WebElement> relativeResult() {
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
}
