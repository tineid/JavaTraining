package Java2HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMethods {
    WebDriver driver;

    public AlertsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void interractWithAlertsOK(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }
    public void explicitAlertWait(){
        //asteptam dupa alerta
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactWithDelayAlert(){
        explicitAlertWait();
        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();
    }

}
