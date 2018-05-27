import org.openqa.selenium.WebDriver;

/**
 * Created by AL on 09/02/2018.
 */
public class LocalDriverManager {


    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}

