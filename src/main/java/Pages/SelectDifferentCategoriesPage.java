package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class SelectDifferentCategoriesPage {
    public static WebElement mainMenuElement() {
        return driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }

    public static WebElement subMenuElement() {
        return driver.findElement(By.cssSelector("a[href=\"/software\"]"));
    }
}
