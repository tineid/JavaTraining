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
        assertEquals("PIM", pimPage.getPageTitle());
        pimPage.addNewEmployee();

        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        assertEquals("Add Employee", addEmployeePage.getPageTitle());
        addEmployeePage.insertNames("loc", "loc", "loc");
        addEmployeePage.randomNumberEmployeeID();
        addEmployeePage.getGeneratedEmployeeID();
        //addEmployeePage.getEmployeeIDNumber();


        addEmployeePage.saveNewEmployee();

        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(driver);
        assertEquals("Personal Details", personalDetailsPage.getPageTitle());
        personalDetailsPage.getFullName();
        String fullName = personalDetailsPage.getFullName();
        String employeeIDNumber = personalDetailsPage.getEmployeeIDNumber();
        System.out.println("Employee ID returnat: " + employeeIDNumber);

        //PIMPage pimPage = new PIMPage(driver);
        assertEquals("PIM", pimPage.getPageTitle());
        pimPage.goToEmployeeList();

        EmployeeListPage employeeListPage = new EmployeeListPage(driver);
       // assertEquals("Employee Information", employeeListPage.getPageTitle());
        employeeListPage.goToEmployeeInfo();
        employeeListPage.enterName(fullName);
        employeeListPage.getNoRecordsFound();
        assertEquals("(1) Record Found", employeeListPage.getNoRecordsFound());
        System.out.println("Recordul a fost salvat cu succes");

    }

}