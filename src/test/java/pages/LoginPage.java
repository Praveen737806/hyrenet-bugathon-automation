package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By email = By.id("email");
    By password = By.id("password");
    By submit = By.id("submit");

    public void login(String e, String p){
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(e);
        driver.findElement(password).sendKeys(p);
        driver.findElement(submit).click();
    }
}
