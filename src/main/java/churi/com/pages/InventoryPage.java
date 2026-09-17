package churi.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // locator
    // personalized atribute
    private By locator_addButton = By.cssSelector("[data-test='add-to-cart-sauce-labs-onesie']");
    private By locator_removeButton = By.cssSelector("[data-test='remove-sauce-labs-onesie']");

    // cart quantity
    private By locator_cartQuantity = By.cssSelector("[data-test='shopping-cart-badge']");
    private By locator_shoppingCartIcon = By.cssSelector("[data-test='shopping-cart-link']");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAddToCart() {
        // finder
        WebElement element_AddButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_addButton));
        // interaction
        element_AddButton.click();
    }

    // clic in Shopping Cart Icon
    public void goToCart() {
        WebElement element_shoppingCartIcon = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_shoppingCartIcon));
        element_shoppingCartIcon.click();
    }

    public String getButtonText() {
        WebElement element_button = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator_removeButton));
        return  element_button.getText();
    }

    public String getCartQuantity() {
        WebElement element_cartQuantity = driver.findElement(locator_cartQuantity);
        return element_cartQuantity.getText();
    }


}
