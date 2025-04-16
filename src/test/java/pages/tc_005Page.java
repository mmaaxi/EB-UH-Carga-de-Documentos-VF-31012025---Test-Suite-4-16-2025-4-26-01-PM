package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By failureMessageLocator = By.className("failure-message");
    private By lockMessageLocator = By.className("lock-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean areAttemptsRecorded() {
        return driver.findElements(failureMessageLocator).size() > 0;
    }

    public boolean isAccountLocked() {
        return driver.findElements(lockMessageLocator).size() > 0;
    }
}