package Java2ProjectPages;

import Java2HelperMethods.AlertsMethods;
import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {

        WebDriver driver;

        ElementsMethods elementsMethods;

        JavaScriptHelpers javaScriptHelpers;

        AlertsMethods alertsMethods;

        Actions actions;

        PracticeFormPage practiceFormPage;





        public CommonPage(WebDriver driver) {
            this.driver = driver;
            this.elementsMethods = new ElementsMethods(driver);
            this.javaScriptHelpers = new JavaScriptHelpers(driver);
            this.alertsMethods = new AlertsMethods(driver);
            this.actions = new Actions(driver);


            PageFactory.initElements(driver, this);

        }
      @FindBy(xpath = "//span[@class='text']")
      List<WebElement> elements;

        public void goToDesiredSubMenu(String submenu){
            javaScriptHelpers.scrollDown(400);
            elementsMethods.selectElementFromListByText(elements, submenu);
        }

    }
