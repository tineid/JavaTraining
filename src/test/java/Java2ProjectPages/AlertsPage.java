package Java2ProjectPages;

import Java2HelperMethods.AlertsMethods;
import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertsPage extends CommonPage{



    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement alertButton;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void simpleAlert(){
        elementsMethods.clickOnElements(alertButton);
        alertsMethods.interractWithAlertsOK();
    }
}
