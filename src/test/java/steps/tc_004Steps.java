package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page passwordRecoveryPage = PageFactory.initElements(driver, tc_004Page.class);

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuarioEnPantallaInicioSesion() {
        driver.get("https://www.ejemplo.com/login");
    }

    @When("el usuario hace clic en 'Olvidé mi contraseña'")
    public void usuarioClicOlvideMiContrasena() {
        passwordRecoveryPage.clickForgotPasswordLink();
    }

    @Then("el sistema redirige a la pantalla de recuperación")
    public void sistemaRedirigePantallaRecuperacion() {
        Assert.assertTrue(passwordRecoveryPage.isOnPasswordRecoveryPage());
    }
    
    @When("el usuario ingresa un email registrado")
    public void usuarioIngresaEmailRegistrado() {
        passwordRecoveryPage.enterRegisteredEmail("usuario@ejemplo.com");
    }

    @Then("el sistema acepta el email ingresado")
    public void sistemaAceptaEmailIngresado() {
        Assert.assertTrue(passwordRecoveryPage.isEmailAccepted());
    }
        
    @When("el usuario hace clic en 'Enviar enlace de recuperación'")
    public void usuarioClicEnviarEnlaceRecuperacion() {
        passwordRecoveryPage.clickSendRecoveryLink();
    }

    @Then("se muestra mensaje de confirmación del envío del enlace")
    public void mensajeConfirmacionEnvioEnlace() {
        Assert.assertTrue(passwordRecoveryPage.isConfirmationMessageDisplayed());
    }
}