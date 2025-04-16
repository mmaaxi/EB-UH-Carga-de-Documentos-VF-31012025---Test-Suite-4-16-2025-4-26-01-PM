package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_009Page;

import static org.junit.Assert.assertTrue;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page = new tc_009Page(driver);

    @Given("que hay un documento previamente cargado")
    public void que_hay_un_documento_previamente_cargado() {
        page.navigateToDocumentList();
        assertTrue(page.isDocumentPresent());
    }

    @When("selecciono el documento")
    public void selecciono_el_documento() {
        page.selectDocument();
    }

    @Then("el documento se resalta o se selecciona en la interfaz")
    public void el_documento_se_resalta_o_selecciona_en_la_interfaz() {
        assertTrue(page.isDocumentHighlighted());
    }

    @When("hago clic en 'Eliminar documento'")
    public void hago_clic_en_eliminar_documento() {
        page.clickDeleteDocumentButton();
    }

    @Then("se muestra un mensaje de confirmación para eliminar el documento")
    public void se_muestra_un_mensaje_de_confirmacion_para_eliminar_el_documento() {
        assertTrue(page.isConfirmationMessageDisplayed());
    }

    @When("confirmo la eliminación")
    public void confirmo_la_eliminacion() {
        page.confirmDeletion();
    }

    @Then("el documento se elimina de la lista de documentos cargados")
    public void el_documento_se_elimina_de_la_lista_de_documentos_cargados() {
        assertTrue(page.isDocumentRemoved());
    }
}