package pages;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RVPage {

    @Inject
    private Provider<String> myName;

    public void myTest() {
        System.out.println(myName.get());
    }
}
