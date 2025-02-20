package FinalProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeeListPage {

    @FindBy(xpath = "//h6[normalize-space()='Add Employee']")
    private WebElement pageTitle;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill']")
    private WebElement employeeInfoButton;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    private WebElement employeeNameInput;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    private WebElement recordFound;

    private WebDriver driver;


   public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        // Așteaptă ca titlul să fie vizibil timp de max 10 secunde
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        return pageTitle.getText();
    }

    public void goToEmployeeInfo(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(employeeInfoButton));
        employeeInfoButton.click();
    }

    public  void enterName(String employeeName){


        employeeNameInput.sendKeys(employeeName);

        searchButton.click();

    }

    public  void enterNoFoundName(String employeeNoFoundName){


        employeeNameInput.sendKeys(employeeNoFoundName);

        searchButton.click();

    }

    public String getNoRecordsFound(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(recordFound));

        return recordFound.getText();
    }
}
