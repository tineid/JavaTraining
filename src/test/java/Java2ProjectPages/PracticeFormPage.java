package Java2ProjectPages;

import Java2HelperMethods.ElementsMethods;
import Java2HelperMethods.JavaScriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends CommonPage{


        @FindBy(id = "firstName")
        WebElement firstNameElement;

        @FindBy(id = "lastName")
        WebElement lastNameElement;

        @FindBy(id = "userEmail")
        WebElement emailElement;

        @FindBy(css = "input[placeholder='Mobile Number']")
        WebElement mobileNumberElement;

        @FindBy(id = "uplodpicture")
        WebElement pictureElement;

        @FindBy(xpath = "//label[@for='gender-radio-1']")
        WebElement maleGenderElement;

        @FindBy(xpath = "//label[@for='gender-radio-2']")
        WebElement femaleGenderElement;

        @FindBy(xpath = "//label[@for='gender-radio-3']")
        WebElement otherGenderElement;

        @FindBy(id = "currentAddress")
        WebElement addressElement;

        @FindBy(id="react-select-3-input")
        WebElement stateEleemnt;

        @FindBy(id="react-select-3-input")
        WebElement cityEleemnt;

        @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
        WebElement sportHobbyElement;

        @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
        WebElement readingHobbyElement;

        @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
        WebElement musicHobbyElement;

   // @FindBy(xpath = "//div[@id='subjectsContainer']")
   // WebElement subjectElement;

    @FindBy(id = "subjectsInput")
    WebElement subjectElement;

    @FindBy(id = "state")
    private WebElement stateDropdown;

    @FindBy(id = "city")
    private WebElement cityDropdown;

    @FindBy(xpath = "//div[contains(@class,'css-11unzgr')]")  // dropdown options container
    private List<WebElement> dropdownOptions;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public void completeFirstRegion (String firstName, String lastName, String email, String address, String mobileNo){

            elementsMethods.fillElement(firstNameElement, firstName);
            elementsMethods.fillElement(lastNameElement, lastName);
            elementsMethods.fillElement(emailElement, email);
            elementsMethods.fillElement(addressElement, address);
            elementsMethods.fillElement(mobileNumberElement, mobileNo);
        }

        public void completeGender (String gender){
            switch (gender) {
                case "Male":
                    elementsMethods.clickOnElements(maleGenderElement);
                    break;
                case "Famele":
                    elementsMethods.clickOnElements(femaleGenderElement);
                    break;

                case "Other":
                    elementsMethods.clickOnElements(otherGenderElement);
            }


        }

 public void completeSubject(String subject){
            elementsMethods.clickOnElements(subjectElement);
            elementsMethods.fillWithActions(subjectElement, subject);
 }
 public void completeSubjectWithList (List<String> list){
            elementsMethods.fillWithMultipleValues(subjectElement,list);
 }

 public void completeHobies(List<String> hobies){
            List<WebElement> hobiesElement=new ArrayList<>();
            hobiesElement.add(sportHobbyElement);
            hobiesElement.add(musicHobbyElement);
            hobiesElement.add(readingHobbyElement);
            elementsMethods.clickMultipleVlaues(hobiesElement, hobies);


 }

    public void selectStateAndCity(String state, String city) {

        javaScriptHelpers.scrollDown(400);
        // Deschide dropdown-ul pentru State
        elementsMethods.clickOnElements(stateDropdown);

        elementsMethods.selectFromDynamicDropdown(state);

        // Deschide dropdown-ul pentru City
        Actions actions = new Actions(driver);
        actions.moveToElement(cityDropdown).click().perform();
        //elementsMethods.clickOnElements(cityDropdown);
        elementsMethods.selectFromDynamicDropdown(city);
    }


}
