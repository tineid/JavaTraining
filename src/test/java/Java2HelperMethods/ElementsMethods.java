package Java2HelperMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;


public class ElementsMethods {

    WebDriver driver;

    Actions actions;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void clickOnElements(WebElement element){

        element.click();
    }

    public void fillElement(WebElement element, String value){

        element.sendKeys(value);

    }

    public void uploadPicture(WebElement element){

        File file = new File("src/test/resources/useforJava.png");
        element.sendKeys(file.getAbsolutePath());

    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value){
        for(int i=0; i<elementsList.size();i++){
            if(elementsList.get(i).getText().equals(value)){
                clickOnElements(elementsList.get(i));
            }
        }
    }
    //cum utilizam metoda asta:
    //avem definite web elements cu @findBy - WebElement maleElement; WebElement femaleElement
    //List<WebElement> genderElement = new ArrayList<>();
    //genderElement.add(maleElement);
    //genderElement.add(femaleElement);
    //genderElement.add(otherElement);
    //elementsMethods.selectElementFromListByText(genderElement, "Female");

    public void changeElements(List<WebElement> list) {
        for (int index = 0; index < list.size(); index++) {
            Actions actions = new Actions(driver);
            WebElement webElement = list.get(index);
            WebElement nextElement = list.get(index++);
            //printText(webElement);
            actions.clickAndHold(webElement)
                    .moveToElement(nextElement)
                    .release()
                    .build()
                    .perform();
        }

        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public void fillWithActions(WebElement webElement, String value) {
        actions.sendKeys(value).perform();
        waitVisibilityElement(webElement);
        actions.sendKeys(Keys.ENTER).perform();
    }



        public void waitVisibilityElement(WebElement webElement) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(webElement));
        }


        public void fillWithMultipleValues(WebElement webElement, List<String> list){
        for (String value: list){
            webElement.sendKeys(value);
            webElement.sendKeys(Keys.ENTER);
        }

        }
       public void clickMultipleVlaues(List<WebElement> webElements, List<String> list){
        for(String value: list){
            for(WebElement webElement: webElements){
                if(webElement.getText().equals(value)){
                    webElement.click();
                }
            }
        }
       }

    public void selectFromDynamicDropdown(String optionText) {
        // Caută opțiunea dorită după text
        List<WebElement> options = driver.findElements(By.cssSelector("div.css-11unzgr")); // toate opțiunile active
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(optionText)) {
                option.click();
                break;
            }
        }
    }

}
