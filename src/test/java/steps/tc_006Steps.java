package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;

public class tc_006Steps {
    
    WebDriver driver;
    tc_006Page page;

    @Given("el usuario ha iniciado sesión con credenciales válidas")
    public void elUsuarioHaIniciadoSesionConCredencialesValidas() {
        driver = new ChromeDriver();
        page = new tc_006Page(driver);
        page.login("usuarioValido", "contraseñaValida");
    }

    @When("el usuario hace clic en \"Cerrar sesión\"")
    public void elUsuarioHaceClicEnCerrarSesion() {
        page.cerrarSesion();
    }

    @Then("el sistema cierra la sesión y redirige al usuario a la página de login")
    public void elSistemaCierraLaSesionYRedirigeAlUsuarioALaPaginaDeLogin() {
        page.verificarRedireccionALogin();
    }

    @When("el usuario intenta acceder a una página protegida sin iniciar sesión")
    public void elUsuarioIntentaAccederAUnaPaginaProtegidaSinIniciarSesion() {
        page.accederPaginaProtegida();
    }

    @Then("el sistema redirige al usuario a la página de inicio de sesión")
    public void elSistemaRedirigeAlUsuarioALaPaginaDeInicioDeSesion() {
        page.verificarRedireccionALogin();
        driver.quit();
    }
}