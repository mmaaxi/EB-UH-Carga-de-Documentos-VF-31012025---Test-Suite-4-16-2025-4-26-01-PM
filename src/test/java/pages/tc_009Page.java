package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    By documentListLocator = By.id("documentList");
    By documentLocator = By.cssSelector(".document");
    By deleteButtonLocator = By.id("deleteDocumentButton");
    By confirmationMessageLocator = By.id("confirmationMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentList() {
        driver.get("http://example.com/documents");
    }

    public boolean isDocumentPresent() {
        return driver.findElements(documentLocator).size() > 0;
    }

    public void selectDocument() {
        WebElement document = driver.findElement(documentLocator);
        document.click();
    }

    public boolean isDocumentHighlighted() {
        WebElement document = driver.findElement(documentLocator);
        return document.getAttribute("class").contains("highlighted");
    }

    public void clickDeleteDocumentButton() {
        driver.findElement(deleteButtonLocator).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessageLocator).isDisplayed();
    }

    public void confirmDeletion() {
        WebElement confirmButton = driver.findElement(By.id("confirmDeleteButton"));
        confirmButton.click();
    }

    public boolean isDocumentRemoved() {
        return driver.findElements(documentLocator).isEmpty();
    }
}