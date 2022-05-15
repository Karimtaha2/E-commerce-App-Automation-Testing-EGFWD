package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class LoginPage {
    public static WebElement clickLoginTab() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement enterEmailAddress() {
        return driver.findElement(By.id("Email"));
    }

    public static WebElement clickLoginButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement seeMyAccountTab() {
        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
}
