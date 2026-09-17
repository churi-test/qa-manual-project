package churi.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriverWait wait;
    // locator
    private By locator_checkoutButton = By.cssSelector("[data-test='checkout']");
    private By locator_firstNameField = By.cssSelector("[data-test='firstName']");

    public CartPage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToCheckout() {
        // finder
        WebElement element_checkoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_checkoutButton));

        // interaction
        element_checkoutButton.click();
    }

    public String getFistNameFieldName() {
        WebElement element_firstNameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_firstNameField));
        return element_firstNameField.getAccessibleName();
    }
}
