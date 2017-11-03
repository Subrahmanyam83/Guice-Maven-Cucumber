package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import javax.inject.Named;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class GooglePage {

    @Inject
    private WebDriver driver;

    @Named("firefox")
    @Inject
    private WebDriver driver1;

    /*Use either this or the above one*/
    /*@Inject
    private Provider<WebDriver> driver;*/

    public void navigate() {
        driver.navigate().to("http://www.google.com");
        driver.quit();

        driver1.navigate().to("http://www.google.com");
        driver1.quit();
    }
}
