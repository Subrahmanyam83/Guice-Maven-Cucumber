package configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class DependencyInjection extends AbstractModule implements InjectorSource {

    public void configure() {
        bind(WebDriver.class).toProvider(ChromeDriverFactory.class).in(ScenarioScoped.class);
        bind(WebDriver.class).annotatedWith(Names.named("firefox")).toProvider(FirefoxDriverFactory.class).in(ScenarioScoped.class);
    }

    /*
    * If not given it creates a default injector whose scope is not set and the driver is created everytime driver is called,
    * because it will call the get() of DependencyInjection class everytime.
    */
    public Injector getInjector() {
        return Guice.createInjector(this, CucumberModules.SCENARIO);
    }
}



