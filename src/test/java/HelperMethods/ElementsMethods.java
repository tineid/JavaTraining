package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;


public class ElementsMethods {

    WebDriver driver;
    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
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
}
