package tests;

import churi.com.pages.CartPage;
import churi.com.pages.CheckoutPage;
import churi.com.pages.InventoryPage;
import churi.com.pages.LoginPage;
import config.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckoutTest extends BaseTest {

    @Test
    @DisplayName("CHECK-SHOP-SAUD01: Completar con datos válidos para la verificación (Checkout)")
    public void validFieldsCheckoutTest() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        // login user
        loginPage.enterLogin("standard_user", "secret_sauce");
        // add product
        inventoryPage.clickAddToCart();
        // go to cart icon
        inventoryPage.goToCart();
        // go to checkout info /checkout-step-one.html
        cartPage.goToCheckout();
        // enter info (name, lastname, zipcode)
        checkoutPage.enterShippingInfo("Juan", "Lopez C.", "20711");
        // clic to finish
        checkoutPage.goToFinish();
        // assertions
        Assertions.assertEquals("Thank you for your order!", checkoutPage.getSuccessMessage());
    }
}
