package Tests;

import Pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static sun.nio.cs.Surrogate.is;

public class ProductsTests extends TestsBase{



    @Test

            public void checkCartIndex() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        assertEquals("Products", productsPage.getPageTitle());

        productsPage = new ProductsPage(driver);
        productsPage.addToCartProductsByIndex(1);
        productsPage.addToCartProductsByIndex(3);
        assertThat(productsPage.getShoppingCartQuantity(), org.hamcrest.Matchers.is(2));
    }

    @Test

    public void checkOutCartItems() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");


        //add second item to cart
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCartProductsByIndex(1);

//     go to cart
        productsPage.goToCart();
//check that the added item is in cart
        CartPage cartPage = new CartPage(driver);
        assertEquals("Your Cart", cartPage.getPageTitle());

        assertEquals("Sauce Labs Bike Light", cartPage.getItemTitle());
        cartPage.goToCheckOut();
//checkout and insert your information
        CheckOutPage checkOutPage= new CheckOutPage(driver);
        assertEquals("Checkout: Your Information", cartPage.getPageTitle());

        checkOutPage.continueAs("dana","barbu",123456);
  // check Overview page
        OverviewPage overviewPage= new OverviewPage(driver);
        assertEquals("Checkout: Overview", overviewPage.getPageTitle());

        //check Overview infos
        assertEquals("SauceCard #31337", overviewPage.getPaymentInfo());
        assertEquals("Free Pony Express Delivery!", overviewPage.getShipping());
        assertEquals("Item total: $9.99", overviewPage.getSubTotalLabel());
        assertEquals("Tax: $0.80", overviewPage.getTaxLabel());
        assertEquals("Total: $10.79", overviewPage.getTotalLabel());
        assertEquals("$9.99", overviewPage.getItemPrice());

        overviewPage.goFinish();

        //Check Finish page

        FinishPage finishPage= new FinishPage(driver);
        assertEquals("Checkout: Complete!", overviewPage.getPageTitle());

        //check Overview infos
        assertEquals("Thank you for your order!", finishPage.getCompleteHeader());
        assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", finishPage.getCompleteText());
        finishPage.goToFirstPage();

        // check the return to Products page

        assertEquals("Products", productsPage.getPageTitle());




    }



}
