package Java2SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class ShareData {
    public WebDriver driver;

    @BeforeMethod
    public void prepareBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Driver inițializat: " + driver);
    }

    @AfterMethod
    public void clearBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}