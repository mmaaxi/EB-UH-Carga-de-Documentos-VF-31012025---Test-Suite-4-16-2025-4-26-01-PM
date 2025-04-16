package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    WebDriver driver = new ChromeDriver();
    tc_003Page page = new tc_003Page(driver);

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver.get("http://example.com/login"); // Modificar con la URL real
    }

    @When("El usuario ingresa un nombre de usuario válido")
    public void el_usuario_ingresa_un_nombre_de_usuario_válido() {
        page.enterUsername("usuarioValido");
    }

    @And("El usuario ingresa una contraseña incorrecta")
    public void el_usuario_ingresa_una_contraseña_incorrecta() {
        page.enterPassword("contraseñaIncorrecta");
    }

    @And("El usuario hace clic en 'Iniciar sesión'")
    public void el_usuario_hace_clic_en_iniciar_sesión() {
        page.clickLoginButton();
    }

    @Then("Se muestra un mensaje informativo de error")
    public void se_muestra_un_mensaje_informativo_de_error() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}