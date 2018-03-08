package steps;

import cucumber.api.java.en.Given;
import utilities.PropertyMap;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.StringContains.containsString;

public class APISteps {
    private Properties properties = PropertyMap.getInstance();

    private final String baURL = properties.getProperty("ba-url");
    private final String iagURL = properties.getProperty("iag-url");
    private final String firstTextToCompare = "British Airways";
    private final String secondTextToCompare = "IAG";
    private final String firstText = "BA";
    private final String secondText = "IAG";

    @Given("I verify the response code of the (.*)")
    public void verifyResponseCodes(String pageName){
        if(pageName.equals(firstText)) {
            given().when().get(baURL).then().statusCode(200);
        }else if(pageName.equals(secondText)){
            given().when().get(iagURL).then().statusCode(200);
        }
    }

    @Given("I verify the response data of the (.*)")
    public void verifyResponseData(String pageName){
        if(pageName.equals(firstText)) {
            given().when().get(baURL).then().body(containsString(firstTextToCompare));
        }else if(pageName.equals(secondText)){
            given().when().get(iagURL).then().body(containsString(secondTextToCompare));
        }
    }


    @Given("I verify the performance of the (.*)")
    public void verifyPerformance(String pageName){
        if(pageName.equals(firstText)){
            given().when().get(baURL).then().time(lessThan(1000L));
        }else if(pageName.equals(secondText)){
            given().when().get(iagURL).then().time(lessThan(3000L));
        }
    }
}