package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {
    private WebDriver driver;
    private tc_005Page loginPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new tc_005Page(driver);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver.get("https://example.com/login");
    }

    @When("el usuario ingresa credenciales incorrectas tres veces consecutivas")
    public void elUsuarioIngresaCredencialesIncorrectasTresVecesConsecutivas() {
        for (int i = 0; i < 3; i++) {
            loginPage.enterCredentials("incorrectUser", "incorrectPassword");
            loginPage.submitLogin();
        }
    }

    @Then("el sistema registra los intentos fallidos")
    public void elSistemaRegistraLosIntentosFallidos() {
        assertTrue(loginPage.areAttemptsRecorded());
    }

    @When("el usuario intenta iniciar sesión nuevamente")
    public void elUsuarioIntentaIniciarSesionNuevamente() {
        loginPage.enterCredentials("incorrectUser", "incorrectPassword");
        loginPage.submitLogin();
    }

    @Then("la cuenta se bloquea y se muestra mensaje de bloqueo")
    public void laCuentaSeBloqueaYSeMuestraMensajeDeBloqueo() {
        assertTrue(loginPage.isAccountLocked());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}