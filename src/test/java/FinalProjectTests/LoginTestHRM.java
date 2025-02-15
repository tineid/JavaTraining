package FinalProjectTests;

import FinalProjectPages.DashboardPage;
import FinalProjectPages.LoginPageHRM;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;



    public class LoginTestHRM extends TestBaseHRM {


        @Test

        public void loginHRMWithValidCredentials() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

            LoginPageHRM loginPageHRM = new LoginPageHRM(driver);
            loginPageHRM.loginHRMAs("Admin", "admin123");

           DashboardPage dashboardPage = new DashboardPage(driver);
           assertEquals("Dashboard", dashboardPage.getPageTitle());
        }
    }


