package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page uploadPage;

    public tc_008Steps() {
        this.driver = Hooks.getDriver();
        uploadPage = PageFactory.initElements(driver, tc_008Page.class);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
    }

    @When("el usuario intenta cargar un documento que supera el tamaño permitido")
    public void el_usuario_intenta_cargar_un_documento_que_supera_el_tamaño_permitido() {
        uploadPage.uploadFile("ruta/al/archivo/excesivo.ext");
    }

    @Then("el sistema rechaza el archivo y muestra un mensaje de error indicando el límite de tamaño")
    public void el_sistema_rechaza_el_archivo_y_muestra_un_mensaje_de_error_indicando_el_límite_de_tamaño() {
        assertTrue(uploadPage.isErrorMessageDisplayed());
    }
}