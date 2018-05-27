


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by AL on 09/02/2018.
 */
public class LocalDriverFactory {


    static WebDriver createInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/PI/drivers/geckodriver.exe");

            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("internet")) {
            driver = new InternetExplorerDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/PI/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
}


