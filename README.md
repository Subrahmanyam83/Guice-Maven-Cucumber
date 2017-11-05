PRE-REQUISITES
1. Make sure that the Runner class is under test/java folder and ends with Test- thats the nomenlature Cucumber follows and understands to execute the Runner Class.
2. Make sure that the Runner Class is under test/java folder.
3. Put the feature files under test/resources.
4. Need to have Selenium, Cucumber(cucumber-jvm,cucumber-java,cucumber-guice,cucumber-junit,),
 Dependency Injection(guice) and Unit Test Framework Dependencies in pom.xml
5. 
 
FRAMEWORK STRUCTURE
1. CONFIGURATION: It contains the DependencyInjection Class which extends AbstractModule of guice and bibds the 
Webdriver Class with the custom class we created(WebdriverFactory).
2. HOOKS: WHich has Before and After hooks.
3. PAGES: Page specific methods
4. STEPS: Step definitions.
5. RUNNER: Runner classes with Cucumber Options - Attach the glue to let the test know where to look for the step definitions.
6. FEATURES: Feature files.

DEPENDENCY INJECTION
1. In the Pages inject the Webdriver dependency by either:
    a. @Inject
           private WebDriver driver;
           
    or
           
    b. @Inject
           private Provider<WebDriver> driver; 
           
    Here we are saying that whenever the Webdriver object is required then 'bind(WebDriver.class).toProvider(ChromeDriverFactory.class).in(ScenarioScoped.class);'
    is called which says that give the ChromeDriverFactory factory generated driver (from the get() method).
    
HOW TO RUN TEST CASES:
1.  To run the Runner Class(manually from IDE), include the following to the VM options in edit configurations: -Dguice.injector-source=configuration.DependencyInjection
2. To run the feature file, it automatically inserts the option in edit configuration.
3. COMMAND LINE: mvn clean -Dguice.injector-source=configuration.DependencyInjection test

REPORTS:
1. After running the test cases using either of the 3 cases - feature file, runner class or command line, the Reports will be generated in target folder.
