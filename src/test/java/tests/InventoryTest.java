package tests;
import static org.junit.jupiter.api.Assertions.*;

import churi.com.pages.InventoryPage;
import churi.com.pages.LoginPage;
import config.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InventoryTest extends BaseTest {

    @Test
    @DisplayName("LIST-PROD-SAUD01: Visualizar el agregado de un producto en el icono del carrito")
    public void AddProductTest() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryTest = new InventoryPage(driver);

        // iniciar sesion
        loginPage.enterLogin("standard_user", "secret_sauce");
        // actions
        // 1. seleccionar un producto
        // 2. Clic en el botón agregar
        inventoryTest.enterAddtoCart();

        // assertions | cambio de boton "Add to cart" a "Remove"
        assertEquals("Remove", inventoryTest.getButtonText());

        // assertions | icono de carrito con  valor de 1
        assertEquals("1", inventoryTest.getCartQuantity());
    }
}
