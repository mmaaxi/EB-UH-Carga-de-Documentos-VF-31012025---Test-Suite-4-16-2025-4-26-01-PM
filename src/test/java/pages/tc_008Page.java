package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_008Page {
    
    WebDriver driver;

    @FindBy(id = "file-upload-input")
    WebElement fileUploadInput;

    @FindBy(id = "error-message")
    WebElement errorMessage;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed() && errorMessage.getText().contains("límite de tamaño");
    }
}