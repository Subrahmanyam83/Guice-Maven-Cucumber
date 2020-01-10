package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import pages.GooglePage;
import pages.RVPage;

public class RVSteps {

    @Inject
    RVPage rvPage;

    @Given("I am Test")
    public void navigateToDPResponsivePage() throws InterruptedException {
        rvPage.myTest();
    }
}
