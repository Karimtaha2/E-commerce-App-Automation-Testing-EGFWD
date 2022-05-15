package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class HomeSlidersPage {
    public static WebElement link_1() {
        return driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }

    public static WebElement link_2() {
        return driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
}
