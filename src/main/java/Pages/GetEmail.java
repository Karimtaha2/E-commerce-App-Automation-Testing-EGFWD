package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driverToGetEmail;

public class GetEmail {
    public static String getEmail() {
        WebElement emailAddressElement = driverToGetEmail.findElement(By.id("address"));
        String emailAddressValue = emailAddressElement.getAttribute("value");
        return emailAddressValue;
    }
}
