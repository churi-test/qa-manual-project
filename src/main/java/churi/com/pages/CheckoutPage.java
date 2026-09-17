package churi.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // locators
    private By locator_firstName = By.cssSelector("[data-test='firstName']");
    private By locator_lastName = By.cssSelector("[data-test='lastName']");
    private By locator_zipCode = By.cssSelector("[data-test='postalCode']");
    private By locator_continueButton = By.cssSelector("[data-test='continue']");
    private By locator_finishButton = By.cssSelector("[data-test='finish']");
    private By locator_successMessage = By.cssSelector("[data-test='complete-header']");


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterShippingInfo(String firstName, String lastName, String zipCode) {
        // finder
        WebElement element_firstName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_firstName));

        WebElement element_lastName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_lastName));

        WebElement element_zipCode = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_zipCode));

        WebElement element_continueButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_continueButton));

        // interaction, write values
        element_firstName.sendKeys(firstName);
        element_lastName.sendKeys(lastName);
        element_zipCode.sendKeys(zipCode);
        element_continueButton.click();
    }

    public void goToFinish() {
        WebElement element_finishButton = driver.findElement(locator_finishButton);
        // redirect to check out finish
        element_finishButton.click();
    }

    public String getSuccessMessage() {
        // find element
        WebElement element_successMessage = driver.findElement(locator_successMessage);
        // return success message "Thank you for your order!"
        return element_successMessage.getText();
    }
}
