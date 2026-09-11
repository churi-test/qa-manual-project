package churi.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // select for id
    // location
    private By locator_user = By.cssSelector("#user-name");
    private By locator_password = By.cssSelector("#password");
    private By locator_submit = By.cssSelector("#login-button");
    // personalized atribute
    private By locator_errorMessage = By.cssSelector("[data-test='error']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(String username, String password) {
        // find element
        WebElement username_element = driver.findElement(locator_user);
        WebElement password_element = driver.findElement(locator_password);
        WebElement submitLogin_element = driver.findElement(locator_submit);
        // interaction
        username_element.sendKeys(username);
        password_element.sendKeys(password);
        submitLogin_element.click();
    }

    public String getErrorMessage() {
        WebElement message_element = driver.findElement(locator_errorMessage);
        return message_element.getText();
    }
}
