package FinalProjectTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBaseHRM {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        // TODO: Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dbarbu\\Downloads\\AUTO\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.urlContains("login"));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
