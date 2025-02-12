package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ProductsPage {

    @FindBy(xpath = "//span[@class=\'title\']")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class='inventory_item']//button")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//span[@data-test= 'shopping-cart-badge']")
    private WebElement shoppingCartBadge;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartIcon;

    private WebDriver driver;


    public ProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){
        return pageTitle.getText();
    }


    public void addToCartProductsByIndex(int index){
        addToCartButtons.get(index).click();
    }

    public int getShoppingCartQuantity(){
        String shoppingCartQuantity = shoppingCartBadge.getText();
        return Integer.valueOf(shoppingCartQuantity);
    }

    public void goToCart(){
        shoppingCartIcon.click();
    }
}
