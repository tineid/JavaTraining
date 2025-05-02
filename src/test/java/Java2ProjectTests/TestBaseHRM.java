package Java2ProjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseHRM {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Configurează automat driverul potrivit pentru versiunea ta de Chrome
        WebDriverManager.chromedriver().setup();

        // Inițializează browserul
        driver = new ChromeDriver();

        // Accesează aplicația
        driver.get("https://demoqa.com/");

        // Maximizează fereastra
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
