package FinalProjectPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AddEmployeePage {

    @FindBy(xpath = "//h6[normalize-space()='Add Employee']")
    private WebElement pageTitle;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement insertName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement insertMiddleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement insertLastName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")

    private WebElement employeeID;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement focusID;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton;

    private WebDriver driver;


    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        // Așteaptă ca titlul să fie vizibil timp de max 10 secunde
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        return pageTitle.getText();
    }

    public void insertNames(String employeeName, String middleName, String lastName) {
        insertName.sendKeys(employeeName);
        insertMiddleName.sendKeys(middleName);
        insertLastName.sendKeys(lastName);
    }



        private String generatedEmployeeID;

        // Metodă pentru generarea și inserarea Employee ID
        public void randomNumberEmployeeID() {
            // Generează un număr aleatoriu de 4 cifre
            Random random = new Random();
            int randomNum = 1000 + random.nextInt(9000); // Interval: 1000 - 9999

            // Stochează ID-ul generat în variabilă
            generatedEmployeeID = String.valueOf(randomNum);

            employeeID.clear();

            // Introduce ID-ul în câmpul Employee ID
            employeeID.sendKeys(generatedEmployeeID);
            focusID.sendKeys(Keys.TAB); // Simulează tab out

            //  Afișează ID-ul generat pentru debugging
            System.out.println("Generated Employee ID: " + generatedEmployeeID);
        }

        // Metodă pentru a obține Employee ID-ul generat
        public String getGeneratedEmployeeID() {
            return generatedEmployeeID;
        }
   // public String getEmployeeID() {
    //    return String.valueOf(focusID);
   // }



    public int getEmployeeIDNumber(){
        String employeeIDNumber = employeeID.getText();
        return Integer.valueOf(employeeIDNumber);
    }

    public void saveNewEmployee() {
        saveButton.click();
    }
}

