package Framework.Steps.Actions;

import Framework.Utils.PageConnector;
import io.cucumber.java.en.And;

public class ActionsSteps {
    private PageConnector connector = new PageConnector();
    private Actions action = new ActionsImpl();

    @And("user click on the {string} button")
    public void userClickOnTheButton(String elementName) throws NoSuchFieldException, IllegalAccessException {
        action.click(connector.getWebElement(elementName));
    }


}
