package Java2HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptHelpers {

    WebDriver driver;

    JavascriptExecutor javascriptExecutor;

    public JavaScriptHelpers(WebDriver driver) {
        this.driver = driver;
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }

    public void scroll(int x, int y){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy("+ x +","+ y +")");
    }

    public void scrollDown (int y){
        scroll(0,y);
    }

    public void scrollRight (int x){
        scroll(x,0);
    }
}
