package Java2ProjectPages;

import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CommonPage{


    @FindBy(xpath = "//h5")
    List<WebElement> elements;

    @FindBy(xpath = "//p[text()='Consent']")
    WebElement consentElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // public HomePage(WebDriver driver) {
   //     this.driver = driver;
   // this.elementsMethods = new ElementsMethods(driver);
   // this.javascriptHelpers = new javascriptHelpers(driver);
   //   PageFactory.initElements(driver, this);
    //}
// facem metode specifice pt pagina
    public void goToDesiredMenu(String menu){
      //  elementsMethods.clickOnElements(consentElement);
        javaScriptHelpers.scrollDown(400);
        elementsMethods.selectElementFromListByText(elements, menu);
    }

}

