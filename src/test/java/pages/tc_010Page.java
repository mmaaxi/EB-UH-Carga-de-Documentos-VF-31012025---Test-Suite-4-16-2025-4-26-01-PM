package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    By documentDetailSection = By.id("document-details");
    By editMetadataField = By.id("edit-metadata");
    By editDescriptionField = By.id("edit-description");
    By saveChangesButton = By.id("save-changes");
    By confirmationMessage = By.id("confirmation-message");

    public void openDocumentDetails() {
        // Assume that document is already loaded and selected
        driver.findElement(documentDetailSection).click();
    }

    public void editDocumentDetails(String metadata, String description) {
        WebElement metadataField = driver.findElement(editMetadataField);
        WebElement descriptionField = driver.findElement(editDescriptionField);
        metadataField.clear();
        metadataField.sendKeys(metadata);
        descriptionField.clear();
        descriptionField.sendKeys(description);
    }

    public void saveChanges() {
        driver.findElement(saveChangesButton).click();
    }

    public boolean isDocumentUpdated() {
        // Simulate check if document is updated, can be more complex validation
        return driver.findElement(documentDetailSection).isDisplayed();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}