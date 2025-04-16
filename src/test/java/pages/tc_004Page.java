package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By forgotPasswordLink = By.id("forgot-password-link");
    By emailField = By.id("email-field");
    By sendRecoveryLinkButton = By.id("send-recovery-link");
    By confirmationMessage = By.id("confirmation-message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isOnPasswordRecoveryPage() {
        return driver.getCurrentUrl().contains("/password-recovery");
    }
    
    public void enterRegisteredEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public boolean isEmailAccepted() {
        return driver.findElement(emailField).getAttribute("value").length() > 0;
    }

    public void clickSendRecoveryLink() {
        driver.findElement(sendRecoveryLinkButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}