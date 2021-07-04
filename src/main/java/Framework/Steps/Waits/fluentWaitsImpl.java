package Framework.Steps.Waits;

import Framework.Utils.DriverFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class fluentWaitsImpl implements waits{

    private DriverFactory factory = new DriverFactory();
    private Wait<WebDriver> fluentWait = new FluentWait<>(factory.getDriver())
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class)
            .ignoring(StaleElementReferenceException.class);

    @Override
    public void waitUntilVisible(WebElement element) {
            fluentWait.until(ExpectedConditions.visibilityOf(element));
    }
    @Override
    public void waitUntilElementsVisible(List<WebElement> elements) {
        fluentWait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitsUntilVisible(WebElement element) {
        fluentWait.until(ExpectedConditions.visibilityOf(element));
    }


    @Override
    public void waitUntilClickable(WebElement element) {
        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Override
    public void waitUntilInvisible(WebElement element) {
        fluentWait.until(ExpectedConditions.invisibilityOf(element));
    }
}
