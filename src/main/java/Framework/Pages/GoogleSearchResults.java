package Framework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchResults {

    @FindBy(xpath="//*[contains(@data-async-context,'query')]/div")
    public static List<WebElement> results;
}
