package tests;
import static org.junit.jupiter.api.Assertions.*;

import churi.com.pages.LoginPage;
import config.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    /*
        Frecuencia: Para este caso de prueba al ser (happy path) tiene una alta frecuencia de ejecución.
        Tomando en cuenta que será usado para posibles pruebas de regresión.
        Criticidad: Si el módulo falla, no permitirá realizar pruebas en los siguientes módulos. (compra)
     */
    @DisplayName("LOG-SAUD01: Login con usuario y contraseña válidas")
    @Test
    public void ValidLoginTest() {
        LoginPage testLogin = new LoginPage(driver);

        testLogin.enterLogin("standard_user", "secret_sauce");

        assertEquals("https://www.saucedemo.com/inventory.html",
                driver.getCurrentUrl());
    }

    @DisplayName("LOG-SAUD02: Login con usuario y contraseña inválidas")
    @Test
    public void InvalidLoginTest() {
        LoginPage testLogin = new LoginPage(driver);

        testLogin.enterLogin("standard_user", "secret_sauce1");

        assertEquals("Epic sadface: Username and password do not match any user in this service",
                testLogin.getErrorMessage());
    }

    @DisplayName("LOG-SAUD03: Login con usuario bloqueado")
    @Test
    public void lockedUserLoginTest() {
        LoginPage testLogin = new LoginPage(driver);

        testLogin.enterLogin("locked_out_user", "secret_sauce");

        assertEquals("Epic sadface: Sorry, this user has been locked out.",
                testLogin.getErrorMessage());
    }

    @DisplayName("LOG-SAUD04: Login de usuario con campos vacíos (usuario y password)")
    @Test
    public void emptyFieldsLoginTest() {
        LoginPage testLogin = new LoginPage(driver);

        testLogin.enterLogin("", "");

        assertEquals("Epic sadface: Username is required",
                testLogin.getErrorMessage());
    }

    @DisplayName("LOG-SAUD05: Login con username sin password")
    @Test
    public void usernameOnlyLoginTest() {
        LoginPage testLogin = new LoginPage(driver);

        testLogin.enterLogin("standard_user", "");

        assertEquals("Epic sadface: Password is required",
                testLogin.getErrorMessage());
    }



}
