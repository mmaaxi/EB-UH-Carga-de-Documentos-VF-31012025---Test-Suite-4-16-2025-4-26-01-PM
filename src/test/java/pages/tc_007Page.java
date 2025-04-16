package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;

    By sectionTitle = By.id("titulo-seccion-carga-documentos");
    By fileInput = By.id("input-archivo");
    By uploadButton = By.id("boton-cargar");
    By confirmationMessage = By.id("mensaje-confirmacion");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToDocumentLoadSection() {
        driver.get("http://sistema.com/carga-documentos");
    }

    public boolean isDocumentLoadSectionDisplayed() {
        return driver.findElement(sectionTitle).isDisplayed();
    }

    public void selectFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isFileSelected() {
        return !driver.findElement(fileInput).getAttribute("value").isEmpty();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadConfirmationDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}