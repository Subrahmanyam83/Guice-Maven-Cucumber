package hooks;

import cucumber.api.java.After;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.Test;

public class ReportHooks {

    private static final Logger LOG= Logger.getLogger(ReportHooks.class.getName());

    @After
    public void afterMethod() {
        LOG.info("\n ********** Creating Cucumber Reports");
        //createReports();
    }

    @Test
    public void createReports(){
        File reportOutputDirectory = new File("target/cucumber-reports");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber-reports/report.json");

        String projectName = "Subu-Guice-Selenium";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();
    }
}
