package Framework.Steps.Actions;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Actions {

    void click(WebElement element);
    void handleDropdownByText(WebElement element, List<WebElement> elements, String value);

}
