package Java2ProjectTests;

import HelperMethods.ElementsMethods;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormTest {

    WebDriver driver;

    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement elementsField;

    @Test
    public void automationMethod() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        ElementsMethods elementMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

        elementMethods.clickOnElements(elementsField);
    }
}