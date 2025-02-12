package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {


    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement userPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;

   // @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
   @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement loginError;



    public String getloginError(){
        return loginError.getText();
    }





    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public  void loginAs(String userName, String password){
        usernameInput.sendKeys(userName);
        userPassword.sendKeys(password);
        loginButton.click();

    }





}
