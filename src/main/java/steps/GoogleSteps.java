package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import pages.GooglePage;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class GoogleSteps {

    @Inject
    GooglePage gpage;

    @Given("I load a google page and quit")
    public void navigateToDPResponsivePage() {
        gpage.navigate();
    }
}
