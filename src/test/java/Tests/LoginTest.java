package Tests;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends TestsBase{




        @Test

        public void loginWithValidCredentials() {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.loginAs("standard_user", "secret_sauce");

            ProductsPage productsPage = new ProductsPage(driver);
            assertEquals("Products", productsPage.getPageTitle());
        }

        @Test

        public void loginWithWrongPwd() {
                LoginPage loginPage = new LoginPage(driver);
                loginPage.loginAs("standard_user", "wrong_pwd");

                ProductsPage productsPage = new ProductsPage(driver);
                assertEquals(loginPage.getloginError(),"Epic sadface: Username and password do not match any user in this service");
            }

        @Test

       public void loginWithEmptyCred() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs(" ", " ");

        ProductsPage productsPage = new ProductsPage(driver);
        assertEquals(loginPage.getloginError(),"Epic sadface: Username and password do not match any user in this service");
       }

       @Test

       public void loginWithoutPwd(){
           LoginPage loginPage = new LoginPage(driver);
           loginPage.loginAs("standard_user", "");

           ProductsPage productsPage = new ProductsPage(driver);
           assertEquals(loginPage.getloginError(),"Epic sadface: Password is required");

       }



    }

