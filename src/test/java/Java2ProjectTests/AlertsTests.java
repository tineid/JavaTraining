package Java2ProjectTests;

import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import Java2ProjectPages.AlertsPage;
import Java2ProjectPages.CommonPage;
import Java2ProjectPages.HomePage;
import Java2ProjectPages.PracticeFormPage;
import Java2SharedData.ShareData;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsTests extends ShareData {
    ElementsMethods elementsMethods;

    JavaScriptHelpers javaScriptHelpers;

    PracticeFormPage practiceFormPage;

    HomePage homePage;

    CommonPage commonPage;

    AlertsPage alertsPage;

    @Test

    public void automationMethod(){
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));

        elementsMethods = new ElementsMethods(this.driver);
        javaScriptHelpers = new JavaScriptHelpers(this.driver);
        homePage = new HomePage(this.driver);
        commonPage = new CommonPage(this.driver);
        practiceFormPage = new PracticeFormPage(this.driver);
        alertsPage = new AlertsPage(this.driver);

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Alerts");

        alertsPage.simpleAlert();


    }
}
