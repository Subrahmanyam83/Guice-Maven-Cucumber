package pages;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import javax.inject.Named;
import java.util.logging.Logger;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class GooglePage {

    Logger LOG = Logger.getLogger(GooglePage.class.getName());

    @Inject
    private Provider<WebDriver> driver;

    @Inject @Named("firefox")
    private Provider<WebDriver> driver1;

    public void navigate() throws InterruptedException {
        LOG.info("\n ********** Opening ad Navigating to the Google PAGE");
        driver.get().navigate().to("http://www.google.com");
        Thread.sleep(10000L);
        driver.get().quit();
        LOG.info("\n ********** Quitting the Driver");
    }

    public void navigateAndPerformNegativeTest() {
        LOG.info("\n ********** Opening ad Navigating to the Google PAGE");
        driver.get().navigate().to("http://www.google.com");
        driver.get().findElement(By.id("unknown")).click();
        driver.get().quit();
        LOG.info("\n ********** Quitting the Driver");
    }

    public void useGuiceProvidedFFInstance(){
        /*Use this when firefox browser is degraded or use Gecko Driver for latest FF version*/
        driver1.get().navigate().to("http://www.google.com");
        driver1.get().quit();
    }
}
