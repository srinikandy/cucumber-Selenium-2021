package Framework.Steps.Waits;

import Framework.Utils.PageConnector;
import io.cucumber.java.en.And;

public class WaitsSteps {

    private PageConnector connector = new PageConnector();
    private waits waits = new fluentWaitsImpl();

    @And("user wait until {string} are visible")
    public void userWaitUntilIsVisible(String elements) throws NoSuchFieldException, IllegalAccessException {
        waits.waitUntilElementsVisible(connector.getWebElements(elements));
    }
}
