import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by AL on 09/02/2018.
 */
public class TwoBrowsersRunningInParallel {
    @Test
    public void startWebDriver() {
        try {
            System.setProperty("webdriver.gecko.driver", "C:/PI/drivers/geckodriver.exe");

//Now you can Initialize marionette driver to launch firefox
            // DesiredCapabilities capabilities = DesiredCapabilities.firefox();

            //  capabilities.setCapability("marionette", true);
            //  WebDriver driver = new MarionetteDriver(capabilities);


            WebDriver driver = new FirefoxDriver();

            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.es");
            System.out.println("-> Thread id = " + Thread.currentThread().getId());
            System.out.println("-> Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());


            Assert.assertTrue("asdasdasd", driver.getTitle().startsWith("Amazon"));

            driver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void startWebDriver2() {
        try {
            System.setProperty("webdriver.gecko.driver", "C:/PI/drivers/geckodriver.exe");

//Now you can Initialize marionette driver to launch firefox
            // DesiredCapabilities capabilities = DesiredCapabilities.firefox();

            //  capabilities.setCapability("marionette", true);
            //  WebDriver driver = new MarionetteDriver(capabilities);


            WebDriver driver = new FirefoxDriver();

            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.com");


            Assert.assertTrue("asdasdasd", driver.getTitle().startsWith("Amazon"));

            driver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
