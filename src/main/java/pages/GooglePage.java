package pages;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import javax.inject.Named;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class GooglePage {

    @Inject
    private Provider<WebDriver> driver;

    @Inject @Named("firefox")
    private Provider<WebDriver> driver1;

    /*If we use pure Webdriver implementation then it will instantiate a driver even if the tests
    * are not calling them. So call Provider<WebDriver> instead.*/
    /*@Inject
    private WebDriver driver;*/

    public void navigate() {
        driver.get().navigate().to("http://www.google.com");
        driver.get().quit();

        driver1.get().navigate().to("http://www.google.com");
        driver1.get().quit();
    }
}
