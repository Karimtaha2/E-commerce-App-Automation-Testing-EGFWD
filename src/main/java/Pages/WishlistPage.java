package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static StepDefinition.Hook.driver;

public class WishlistPage {

    public static WebElement specificProduct() {
        return driver.findElement(By.cssSelector("div[class=\"product-grid home-page-product-grid\"]"));
    }

    public static WebElement wishlistIcon() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public static void selectTypeOfProcessor() {
        WebElement dropList = driver.findElement(By.id("product_attribute_1"));
        Select select = new Select(dropList);
        select.selectByValue("1");
    }

    public static void selectRam() {
        WebElement dropList = driver.findElement(By.id("product_attribute_2"));
        Select select = new Select(dropList);
        select.selectByValue("5");
    }

    public static void selectHDD() {
        driver.findElement(By.id("product_attribute_3_7")).click();
    }

    public static void selectOS() {
        driver.findElement(By.id("product_attribute_4_9")).click();
    }

    public static void selectSoftware() {
        driver.findElement(By.id("product_attribute_5_11")).click();
        driver.findElement(By.id("product_attribute_5_12")).click();
    }

    public static WebElement wishlistButton() {
        return driver.findElement(By.id("add-to-wishlist-button-1"));
    }

    public static WebElement message() {
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
