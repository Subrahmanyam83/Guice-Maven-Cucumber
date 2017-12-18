package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class GooglePage {

    Logger LOG = Logger.getLogger(GooglePage.class.getName());

    public void navigate() {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();

        LOG.info("\n ********** Opening ad Navigating to the Google PAGE");
        driver.navigate().to("http://www.google.com");
        driver.quit();
        LOG.info("\n ********** Quitting the Driver");
    }
}
