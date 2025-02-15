package FinalProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PersonalDetailsPage {


        @FindBy(xpath = "//h6[normalize-space()='Personal Details']")
        private WebElement pageTitle;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
    private WebElement id;
  //  @FindBy(cssSelector = "div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] button[type='submit'])
 //   private WebElement saveButton1;

 //   @FindBy(cssSelector = "div[class='orangehrm-custom-fields'] button[type='submit'])

    private WebDriver driver;


    public PersonalDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        // Așteaptă ca titlul să fie vizibil timp de max 10 secunde
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        return pageTitle.getText();
    }

    public String getEmployeeID() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(id));
        //return String.valueOf(id);
        return id.getText();
    }

   // public void saveButton1() {
   //     saveButton1.click();
    //}
}
