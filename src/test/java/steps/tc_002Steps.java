package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver = new ChromeDriver();
    tc_002Page loginPage = new tc_002Page(driver);

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver.get("https://www.example.com/login");
    }

    @When("ingresa nombre de usuario {string}")
    public void ingresaNombreDeUsuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("ingresa contraseña {string}")
    public void ingresaContraseña(String password) {
        loginPage.enterPassword(password);
    }

    @And("hace clic en {string}")
    public void haceClicEnIniciarSesion(String button) {
        loginPage.clickLoginButton();
    }

    @Then("se muestra un mensaje de error {string}")
    public void seMuestraUnMensajeDeError(String expectedMessage) {
        loginPage.verifyErrorMessage(expectedMessage);
        driver.quit();
    }
}