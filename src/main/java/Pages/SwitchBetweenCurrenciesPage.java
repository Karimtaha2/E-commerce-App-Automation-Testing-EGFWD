package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static StepDefinition.Hook.driver;

public class SwitchBetweenCurrenciesPage {
    public static WebElement dropListElement() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public static List<WebElement> productPrice() {
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

}
