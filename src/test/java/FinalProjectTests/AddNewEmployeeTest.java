package FinalProjectTests;

import FinalProjectPages.*;
import Tests.TestsBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNewEmployeeTest extends TestBaseHRM {

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
        assertEquals("PIM",pimPage.getPageTitle());
        pimPage.addNewEmployee();

        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        assertEquals("Add Employee",addEmployeePage.getPageTitle());
        addEmployeePage.insertNames("fac", "fac", "fac");
        addEmployeePage.randomNumberEmployeeID();
        addEmployeePage.getGeneratedEmployeeID();
        //addEmployeePage.getEmployeeID();


        addEmployeePage.saveNewEmployee();

        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(driver);
        assertEquals("Personal Details",personalDetailsPage.getPageTitle());
        String employeeID = personalDetailsPage.getEmployeeID();
        System.out.println("Employee ID returnat: " + employeeID);
        //personalDetailsPage.saveButton1();
    }


}