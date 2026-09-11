package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    // comparte y no necesita de un metodo publico
    protected WebDriver driver;

    @BeforeEach
    // abrir sesion una sola vez para cada prueba
    public void setUp() {
        driver = new ChromeDriver(); // prepara la peticion y las acciones para traducirla al lenguaje del navegador
        driver.get("https://www.saucedemo.com/"); // y el navegador ejecuta la acción
    }

    @AfterEach
    // cerrar sesion una vez para cada prueba
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
