package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By dashboardPage = By.id("dashboard");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyDashboardPage() {
        if (driver.findElement(dashboardPage).isDisplayed()) {
            System.out.println("Login successful, dashboard displayed.");
        } else {
            throw new AssertionError("Dashboard not displayed.");
        }
    }
}