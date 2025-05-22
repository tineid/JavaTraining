package Java2SharedData;


import org.testng.annotations.Test;
import org.testng.Assert;

public class BasicTest extends ShareData {

    @Test
    public void testDriverNotNull() {
        System.out.println("Driver în test: " + driver);
        Assert.assertNotNull(driver);
        driver.get("https://demoqa.com/automation-practice-form");
    }
}