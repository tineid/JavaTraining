package FinalProjectTests;

import FinalProjectPages.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEmployeeTest {

    @Nested
    class SearchNewEmployeeTest extends TestBaseHRM {

        @Test

        public void addNewEmployee() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

            LoginPageHRM loginPageHRM = new LoginPageHRM(driver);
            loginPageHRM.loginHRMAs("Admin", "admin123");

            DashboardPage dashboardPage = new DashboardPage(driver);
            assertEquals("Dashboard", dashboardPage.getPageTitle());
            dashboardPage.goToPIM();

            PIMPage pimPage = new PIMPage(driver);
            assertEquals("PIM", pimPage.getPageTitle());
            pimPage.goToEmployeeList();

            EmployeeListPage employeeListPage = new EmployeeListPage(driver);


            employeeListPage.goToEmployeeInfo();
            employeeListPage.enterNoFoundName("No Found");
            employeeListPage.getNoRecordsFound();
            assertEquals("No Records Found", employeeListPage.getNoRecordsFound());
            System.out.println("Recordul nu a fost gasit pentru ca nu exista");
        }
    }
}
