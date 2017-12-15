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

    public void navigate() {
        driver.get().navigate().to("http://www.google.com");
        driver.get().quit();
    }

    public void useGuiceProvidedFFInstance(){
        /*Use this when firefox browser is degraded or use Gecko Driver for latest FF version*/

        driver1.get().navigate().to("http://www.google.com");
        driver1.get().quit();
    }
}
