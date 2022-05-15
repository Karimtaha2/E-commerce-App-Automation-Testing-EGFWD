package StepDefinition;

import Pages.GetEmail;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Pages.RegisterPage.*;
import static Pages.WishlistPage.specificProduct;

public class Hook {

    static public WebDriver driver = null;
    static public WebDriver driverToGetEmail = null;
    static public String validEmail = "";
    static public String validPassword = "@test12345";
    static public SoftAssert verifyRegistration = new SoftAssert();
    static public boolean isRegister = false;

    @BeforeAll
    public static void user_open_chrome_browser() {
        String path = System.getProperty("user.dir") + "\\\\src\\\\main\\\\resources\\\\chromedriver.exe\\";
        System.setProperty("webdriver.chrome.driver", path);

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public static void sleep(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // Common steps between features
    @Given("open home page again")
    public void open_home_page_again() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Given("user navigates to home page")
    public void user_navigates_to_home_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Wrong HomePage Link");
    }

    @When("user enter email address")
    public void user_enter_email_address() throws InterruptedException {
        emailAddress().clear();
        driverToGetEmail = new ChromeDriver();
        if (validEmail.isEmpty()) {
            driverToGetEmail.navigate().to("https://mail.tm/en/");
            do {
                validEmail = GetEmail.getEmail();
            } while (!(validEmail.contains("@")));  // check functionality email
            System.out.println("Email: " + validEmail);
            System.out.println("Password: " + validPassword);
        }
        driverToGetEmail.quit();
        Thread.sleep(2000);
        emailAddress().sendKeys(validEmail);
    }

    @When("user enter password")
    public void user_enter_password() {
        enterPassword().sendKeys(validPassword);
    }

    @Then("user clicked on Log out tab")
    public void user_clicked_on_log_out_tab() {
        clickLogoutButton().click();
    }

    @Given("user scroll down to products")
    public void user_scroll_down_to_products() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();", specificProduct());
        Hook.sleep(20);
    }

    @AfterAll
    public static void closeDriver() {
        sleep(30);
        driver.quit();
    }

}
