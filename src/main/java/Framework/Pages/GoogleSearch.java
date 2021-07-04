package Framework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch {

    @FindBy(name = "q")
    public static WebElement search;

    @FindBy(xpath = "(//*[@name=\'btnK\'])[1]")
    public static WebElement searchButton;
}
