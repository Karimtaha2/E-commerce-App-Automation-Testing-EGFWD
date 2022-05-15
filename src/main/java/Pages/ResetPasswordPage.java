package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class ResetPasswordPage {
    public static WebElement clickOnForgetPassword() {
        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public static WebElement clickOnRecoverButton() {
        return driver.findElement((By.cssSelector("button[class=\"button-1 password-recovery-button\"]")));
    }

    public static WebElement message() {
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
