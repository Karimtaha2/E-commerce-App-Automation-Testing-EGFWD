package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static StepDefinition.Hook.driver;

public class RegisterPage {

    public static WebElement registerLink() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }

    public static WebElement genderMale() {
        return driver.findElement(By.id("gender-male"));
    }

    public static WebElement genderFemale() {
        return driver.findElement(By.id("gender-female"));
    }

    public static WebElement firstName() {
        return driver.findElement(By.id("FirstName"));
    }

    public static WebElement lastName() {
        return driver.findElement(By.id("LastName"));
    }

    public static Select dateOfBirthDay() {
        WebElement DateOfBirthDay = driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select Day = new Select(DateOfBirthDay);
        return Day;
    }

    public static Select dateOfBirthMonth() {
        WebElement DateOfBirthMonth = driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        Select Month = new Select(DateOfBirthMonth);
        return Month;
    }

    public static Select dateOfBirthYear() {
        WebElement DateOfBirthYear = driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        Select Year = new Select(DateOfBirthYear);
        return Year;
    }

    public static WebElement emailAddress() {
        return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }

    public static WebElement enterCompanyName() {
        return driver.findElement(By.id("Company"));
    }

    public static WebElement newsletterOption() {
        return driver.findElement(By.id("Newsletter"));
    }

    public static WebElement enterPassword() {
        return driver.findElement(By.id("Password"));
    }

    public static WebElement enterConfirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement clickRegisterButton() {
        return driver.findElement(By.id("register-button"));
    }

    // After Registration
    public static WebElement message() {
        return driver.findElement(By.className("result"));
    }

    public static WebElement clickContinueButton() {
        return driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }

    public static WebElement logoutLink() {
        return driver.findElement(By.className("ico-logout"));
    }

    public static WebElement clickLogoutButton() {
        return driver.findElement(By.className("ico-logout"));
    }

}
