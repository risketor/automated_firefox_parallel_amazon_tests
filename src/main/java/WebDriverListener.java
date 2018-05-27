import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by AL on 09/02/2018.
 */
public class WebDriverListener implements IInvokedMethodListener{


        @Override
        public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {


            if (method.isTestMethod()) {

                String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
                WebDriver driver = LocalDriverFactory.createInstance(browserName);


                LocalDriverManager.setWebDriver(driver);

            }
        }

        @Override
        public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
            System.out.println("1 AFTER INVOKATION " + Thread.currentThread().getId());
            if (method.isTestMethod()) {
                System.out.println("2 AFTER INVOKATION" + Thread.currentThread().getId());


                WebDriver driver = LocalDriverManager.getDriver();
                if (driver != null) {
                    driver.quit();
                }
            }
        }
}

