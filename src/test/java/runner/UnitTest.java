package runner;

import org.junit.Test;
import java.util.logging.Logger;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Subrahmanyam on 14/Dec/2017
 */
public class UnitTest {

    private static final Logger LOG = Logger.getLogger(UnitTest.class.getName());

    @Test
    public void second(){
        LOG.fine(String.format("Second Test %s",LOG.getName()));
        assertTrue(1>0);
    }
}
