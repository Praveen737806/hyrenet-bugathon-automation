package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class AssessmentPage {

    WebDriver driver;
    WebDriverWait wait;

    public AssessmentPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Generic Create button locator
    By createBtn = By.xpath("//button");

    public void clickCreate(){

        // Wait until any button appears
        wait.until(ExpectedConditions.presenceOfElementLocated(createBtn));

        WebElement btn = driver.findElements(createBtn).get(0);

        // JS Click (bypass React issues)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btn);
    }
}
