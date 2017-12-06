PRE-REQUISITES
1. Make sure that the Runner class is under test/java folder and ends with Test- thats the nomenlature Cucumber follows and understands to execute the Runner Class.
2. In the RunnerClass, glue path should be 'steps' - which is relative to the src/main/java folder. Do not specify the path as 'src/main/java/steps'.
3. Put the feature files under test/resources or src/resources - it does not matter.
4. Need to have Selenium, Cucumber(cucumber-guice,cucumber-junit),
 Dependency Injection(guice) and Unit Test Framework Dependencies in pom.xml
5. Hooks's methods should be public and not private or else they wont be called.
 
FRAMEWORK STRUCTURE
1. CONFIGURATION: It contains the DependencyInjection Class which extends AbstractModule of guice and binds the 
Webdriver Class with the custom class we created(ChromeDriverFactory/FirefoxDriverFactory).
2. HOOKS: Before and After hooks which runs before and After a test.
3. PAGES: Contains Page specific methods.
4. STEPS: Step definitions.
5. RUNNER: Runner classes with Cucumber Options - Attach the glue to let the test know where to look for the step definitions(eg:steps)
6. FEATURES: Feature files.

DEPENDENCY INJECTION
1. In the Pages inject the Webdriver dependency by either:
    a. @Inject
           private WebDriver driver; //But this will create an instance of Webdriver everytime even when it is not invoked
    or
    b. @Inject
           private Provider<WebDriver> driver; 
           
    Here we are saying that whenever the Webdriver object is required then 'bind(WebDriver.class).toProvider(ChromeDriverFactory.class).in(ScenarioScoped.class);'
    is called which says that give the ChromeDriverFactory factory generated driver (from the get() method).
    
HOW TO RUN TEST CASES:
1.  To run the Runner Class(manually from IDE), include the following to the VM options in edit configurations: -Dguice.injector-source=configuration.DependencyInjection
(You have to only give this configuration when you have explicitly created an Injector class -in this case it is ''' DependencyInjection ''')
2. To run the feature file, it automatically inserts the option in edit configuration.
3. COMMAND LINE: mvn clean -Dguice.injector-source=configuration.DependencyInjection test

REPORTS:
1. After running the test cases using either of the 3 cases - feature file, runner class or command line, the Reports will be generated in target folder.
