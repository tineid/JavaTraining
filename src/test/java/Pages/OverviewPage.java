package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    @FindBy(xpath = "//span[@class=\'title\']")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    private WebElement item;

    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
    private WebElement itemPrice;

    @FindBy(xpath = "//div[@data-test=\"payment-info-value\"]")
    private WebElement paymentInfovalue;

    @FindBy(xpath = "//div[@data-test=\"shipping-info-value\"]")
    private WebElement shippingInfoValue;

    @FindBy(xpath = "//div[@data-test=\"subtotal-label\"]")
    private WebElement subTotalLabel;

    @FindBy(xpath = "//div[@data-test=\"tax-label\"]")
    private WebElement taxLabel;

    @FindBy(xpath = "//div[@data-test=\"total-label\"]")
    private WebElement totalLabel;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    private WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){

        return pageTitle.getText();
    }
    public String getItemTitle(){
        return item.getText();}

    public String getTotalLabel(){
        return totalLabel.getText();}

    public String getSubTotalLabel(){
        return subTotalLabel.getText();}

    public String getTaxLabel(){
        return taxLabel.getText();}

    public String getShipping(){
        return shippingInfoValue.getText();}

    public String getPaymentInfo(){
        return paymentInfovalue.getText();}

    public String getItemPrice(){
        return itemPrice.getText();}

    public void goToFinish(){
        finishButton.click();
    }

    public void goFinish() {
        finishButton.click();
    }
}
