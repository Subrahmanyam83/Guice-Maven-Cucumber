package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.logging.Logger;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class Hooks {

    private static final Logger LOG= Logger.getLogger(Hooks.class.getName());

    @Before
    public void beforeMethod() {
        LOG.fine("Calling Before Hook");
    }

    @After
    public void afterMethod() {
        LOG.fine("Calling After Hook");
    }
}
