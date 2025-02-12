import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // TODO: Set the path to the WebDriver executable
        // Windows based OS
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dbarbu\\Downloads\\AUTO\\chromedriver-win64\\chromedriver.exe");
        // Linux based OS
     //   System.setProperty("webdriver.chrome.driver", "/home/anadasan/Downloads/chromedriver-linux64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogleTest() {
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();

        assertEquals(pageTitle, "Google");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
