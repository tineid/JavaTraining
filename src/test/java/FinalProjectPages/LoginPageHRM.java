package FinalProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHRM {

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement userPassword;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement loginButton;


    private WebDriver driver;

    public LoginPageHRM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public  void loginHRMAs(String userName, String password){
        usernameInput.sendKeys(userName);
        userPassword.sendKeys(password);
        loginButton.click();

    }

}
