package FinalProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {
    @FindBy(xpath = "//div[@class='oxd-topbar-header-title']")
    private WebElement pageTitle;

    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --visited']")
    private WebElement employeeList;

    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    private WebElement addEmployee;

    private WebDriver driver;


    public PIMPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){
        // Așteaptă ca titlul să fie vizibil timp de max 10 secunde
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        return pageTitle.getText();
    }

    public void goToEmployeeList(){
        employeeList.click();
    }

    public void addNewEmployee(){
        addEmployee.click();
    }
}
