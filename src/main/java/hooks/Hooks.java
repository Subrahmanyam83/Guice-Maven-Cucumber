package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */
public class Hooks {

    @Before
    public void beforeMethod() {
        System.out.println("Calling Before Hook");
    }

    @After
    public void afterMethod() {
        System.out.println("Calling After Hook");
    }
}
