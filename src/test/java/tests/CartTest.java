package tests;

import churi.com.pages.CartPage;
import churi.com.pages.InventoryPage;
import churi.com.pages.LoginPage;
import config.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartTest extends BaseTest {

    @Test
    @DisplayName("CART-SHOP-SAUD01: Continuar la verificación de productos con el Checkout")
    public void shoppingCheckoutTest() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        // login user
        loginPage.enterLogin("standard_user", "secret_sauce");
        // add product
        inventoryPage.clickAddToCart();
        // go to cart icon
        inventoryPage.goToCart();
        // clic "Checkout" button
        cartPage.goToCheckout();

        // assertions
        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-one.html",
                driver.getCurrentUrl());
    }
}
