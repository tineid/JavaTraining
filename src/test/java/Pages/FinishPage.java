package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backHomeButton;
    @FindBy(xpath = "//h2[@class=\"complete-header\"]")
    private WebElement completeHeader;
    @FindBy(xpath = "//div[@data-test=\"complete-text\"]")
    private WebElement completeText;

    private WebDriver driver;

    public FinishPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getCompleteHeader(){

        return completeHeader.getText();
    }
    public String getCompleteText(){
        return completeText.getText();}



    public void goToFirstPage(){
        backHomeButton.click();
    }

    public void goHome() {
        backHomeButton.click();
    }


}
