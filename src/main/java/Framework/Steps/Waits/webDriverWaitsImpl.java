package Framework.Steps.Waits;

import Framework.Utils.DriverFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class webDriverWaitsImpl implements waits{

    private DriverFactory factory = new DriverFactory();
    private WebDriverWait webDriverWait =
            new WebDriverWait(factory.getDriver(), 30);

    @Override
    public void waitUntilVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    @Override
    public void waitUntilElementsVisible(List<WebElement> elements) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitsUntilVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    @Override
    public void waitUntilClickable(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Override
    public void waitUntilInvisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }
}
