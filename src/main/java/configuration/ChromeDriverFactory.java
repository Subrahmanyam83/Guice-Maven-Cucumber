package configuration;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class ChromeDriverFactory implements Provider<WebDriver> {

    private static final String DRIVERPATH = "C:\\Browserdrivers_Selenium\\";

    public WebDriver get() {
        System.setProperty("webdriver.chrome.driver", DRIVERPATH + "chromedriver.exe");
        return new ChromeDriver();
    }
}
