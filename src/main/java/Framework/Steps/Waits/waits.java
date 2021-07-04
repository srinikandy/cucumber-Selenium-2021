package Framework.Steps.Waits;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface waits {

    void waitUntilVisible(WebElement element);
    void waitUntilElementsVisible(List<WebElement> element);
    void waitUntilClickable(WebElement element);
    void waitUntilInvisible(WebElement element);

}
