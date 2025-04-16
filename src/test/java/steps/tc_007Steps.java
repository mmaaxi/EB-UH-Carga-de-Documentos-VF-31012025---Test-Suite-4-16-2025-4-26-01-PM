package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;
import io.cucumber.java.en.*;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page documentLoadPage = new tc_007Page(driver);

    @Given("el usuario está en la sección 'Carga de Documentos'")
    public void navegar_a_carga_de_documentos() {
        documentLoadPage.goToDocumentLoadSection();
        Assert.assertTrue(documentLoadPage.isDocumentLoadSectionDisplayed());
    }

    @When("el usuario selecciona un archivo para cargar")
    public void seleccionar_archivo_para_cargar() {
        documentLoadPage.selectFile("ruta/del/archivo");
        Assert.assertTrue(documentLoadPage.isFileSelected());
    }

    @And("hace clic en 'Cargar documento'")
    public void cargar_documento() {
        documentLoadPage.clickUploadButton();
    }

    @Then("el documento se sube correctamente y se muestra una confirmación")
    public void verificar_confirmacion_de_carga() {
        Assert.assertTrue(documentLoadPage.isUploadConfirmationDisplayed());
    }
}