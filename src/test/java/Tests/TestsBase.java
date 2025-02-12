package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsBase {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        // TODO: Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dbarbu\\Downloads\\AUTO\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
