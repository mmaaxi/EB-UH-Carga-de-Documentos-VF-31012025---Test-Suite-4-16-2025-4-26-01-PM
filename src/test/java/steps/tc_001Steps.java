package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
        loginPage = new tc_001Page(driver);
    }

    @When("el usuario ingresa el nombre de usuario {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("el usuario ingresa la contraseña {string}")
    public void el_usuario_ingresa_la_contraseña(String password) {
        loginPage.enterPassword(password);
    }

    @And("el usuario hace clic en el botón {string}")
    public void el_usuario_hace_clic_en_el_botón(String button) {
        loginPage.clickLoginButton();
    }

    @Then("el usuario es redirigido al dashboard")
    public void el_usuario_es_redirigido_al_dashboard() {
        loginPage.verifyDashboardPage();
        driver.quit();
    }
}