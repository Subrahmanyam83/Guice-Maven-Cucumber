package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/",
                 glue = {"steps","hooks"},
                 format = {"pretty", "html:target/cucumber" })
public class RunnerTest {

}
