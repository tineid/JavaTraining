package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {


        @FindBy(xpath = "//span[@class=\'title\']")
        private WebElement pageTitle;

        @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
        private WebElement item;

        @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
        private WebElement fleeceJacket;

        @FindBy(xpath = "//button[@id='checkout']")
        private WebElement checkOutButton;

    private WebDriver driver;

        public CartPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

        public String getPageTitle(){

            return pageTitle.getText();
        }
        public String getItemTitle(){
        return item.getText();}

      public void goToCheckOut(){
        checkOutButton.click();
    }
}
