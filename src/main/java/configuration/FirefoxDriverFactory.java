package configuration;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class FirefoxDriverFactory implements Provider<WebDriver> {

    public WebDriver get() {
        return new FirefoxDriver();
    }
}