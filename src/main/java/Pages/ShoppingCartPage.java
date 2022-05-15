package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class ShoppingCartPage {
    public static WebElement selectProduct() {
        return driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public static WebElement addToProductButton() {
        return driver.findElement(By.id("add-to-cart-button-4"));
    }

    public static WebElement message() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
}
