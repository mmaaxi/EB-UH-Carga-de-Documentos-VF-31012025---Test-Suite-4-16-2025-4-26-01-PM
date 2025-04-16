package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.get("https://www.ejemplo.com/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    public void cerrarSesion() {
        WebElement cerrarSesionButton = driver.findElement(By.id("cerrarSesion"));
        cerrarSesionButton.click();
    }

    public void verificarRedireccionALogin() {
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.contains("login")) {
            throw new IllegalStateException("No se redireccionó a la página de login");
        }
    }

    public void accederPaginaProtegida() {
        driver.get("https://www.ejemplo.com/pagina-protegida");
    }
}