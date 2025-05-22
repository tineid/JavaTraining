package Java2ProjectTests;

import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import Java2ProjectPages.CommonPage;
import Java2ProjectPages.HomePage;
import Java2ProjectPages.PracticeFormPage;
import Java2SharedData.ShareData;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends ShareData {


    ElementsMethods elementsMethods;

    JavaScriptHelpers javaScriptHelpers;

    PracticeFormPage practiceFormPage;
    HomePage homePage;
    CommonPage commonPage;
    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement elementsField;


    @Test
    public void automationMethod() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));

        elementsMethods = new ElementsMethods(this.driver);
        javaScriptHelpers = new JavaScriptHelpers(this.driver);
        homePage = new HomePage(this.driver);
        commonPage = new CommonPage(this.driver);
        practiceFormPage = new PracticeFormPage(this.driver);

        homePage.goToDesiredMenu("Forms");
        commonPage.goToDesiredSubMenu("Practice Form");

        practiceFormPage.completeFirstRegion("Cristine", "Barbu", "as@email.com", "str 3", "23433000");
        practiceFormPage.completeGender("Other");

        List<String> subject = new ArrayList<>();
        subject.add("Maths");
        subject.add("English");
        practiceFormPage.completeSubjectWithList(subject);

        // 🔽 Aici e blocul care trebuie să fie în interiorul metodei
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Music");
        hobbies.add("Reading");
        practiceFormPage.completeHobies(hobbies);
        javaScriptHelpers.scroll(0,400);

        practiceFormPage.selectStateAndCity("NCR", "Delhi");
    }
}