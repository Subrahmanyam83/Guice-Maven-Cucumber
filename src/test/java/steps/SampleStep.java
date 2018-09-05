package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class SampleStep {

    WebDriver remoteDriver=null;
    DesiredCapabilities caps = null;
    String hubHostAndPort="http://selenium.baplc.com:4444/";
    String hubUrl=hubHostAndPort+"wd/hub";
    String sessionID=null;
    String hostname=null;

    public WebDriver getDriver() throws MalformedURLException {

        caps = DesiredCapabilities.chrome();
        caps.setPlatform(Platform.WINDOWS);

        LoggingPreferences logs = new LoggingPreferences();
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.CLIENT, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        logs.enable(LogType.SERVER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logs);
        caps.setCapability("webdriver.chrome.logfile","logs.log");
        remoteDriver = new RemoteWebDriver(new URL(hubUrl),caps);
        ((RemoteWebDriver) remoteDriver).setLogLevel(Level.ALL);
        return remoteDriver;
    }

    @Given("I call a sample script")
    public void testAsampleScript() throws MalformedURLException, InterruptedException {

        WebDriver driver = getDriver();
        driver.get("http://www.google.com");
        Thread.sleep(10000L);
        System.out.println("Hey");
        driver.quit();

    }
}
