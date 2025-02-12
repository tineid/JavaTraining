package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    @FindBy(xpath = "//span[@class=\'title\']")
    private WebElement pageTitle;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement inputZipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    private WebDriver driver;

    public CheckOutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){

        return pageTitle.getText();
    }
    public  void continueAs(String firstName, String lastName, int zipCode) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputZipCode.sendKeys(String.valueOf(zipCode));
        continueButton.click();
    }



}
