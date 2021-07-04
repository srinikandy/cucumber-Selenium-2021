package Framework.Steps.Actions;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ActionsImpl implements Actions{
    @Override
    public void click(WebElement element) {
        element.click();
    }

    @Override
    public void handleDropdownByText(WebElement element, List<WebElement> elements, String value) {

    }
}
