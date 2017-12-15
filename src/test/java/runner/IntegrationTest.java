package runner;

import org.junit.Test;
import java.util.logging.Logger;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Subrahmanyam on 14/Dec/2017
 */
public class IntegrationTest {

    private static final Logger LOG= Logger.getLogger(IntegrationTest.class.getName());

    @Test
    public void firstTest(){
        LOG.info("First Test");
        assertTrue(1>0);
    }
}
