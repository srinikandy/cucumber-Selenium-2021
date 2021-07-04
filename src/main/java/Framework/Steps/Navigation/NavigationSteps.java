package Framework.Steps.Navigation;

import Framework.Steps.Screenshots.CaptureScreenshotsImpl;
import Framework.Steps.Screenshots.CaptureScreenshots;
import Framework.Utils.DriverFactory;
import Framework.Utils.PageConnector;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import java.io.IOException;

public class NavigationSteps {
    //interface            //class
    Navigation navigation = new BrowserNavigation();
    CaptureScreenshots screenshots = new CaptureScreenshotsImpl();
    private PageConnector page = new PageConnector();

    //1 created an interface -defined method without implementation -Navigation
    //2 created class implementing all methods as per interface contract -BrowserNavigation
    //3 Used interface reference in a step definition class - NavigationSteps

    @Then("user navigate to the {string} url")
    public void user_navigate_to(String url) throws IOException, InterruptedException {
        navigation.navigateTo(url);
    }

    @Then("user is on the {string} page")
    public void userIsOnThePage(String pageName) throws ClassNotFoundException {
        page.initializePage(pageName);
    }

    @And("user enters {string} in the {string} text box")
    public void userEntersInTheTextBox(String keyWord, String element) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
        page.getWebElement(element).sendKeys(keyWord);
        Thread.sleep(3000);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(
                    screenshots.captureScreenshotAsBytes(),
                    "image/png",
                    "screenshot"
            );
        }
        navigation.quitDriver();
        DriverFactory.driver = null;
    }

}
