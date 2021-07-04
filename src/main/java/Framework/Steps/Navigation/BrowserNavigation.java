package Framework.Steps.Navigation;

import Framework.Utils.DriverFactory;
import Framework.Utils.PropertyManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class BrowserNavigation extends DriverFactory implements Navigation{
    //private DriverFactory driverFactory;

//    public BrowserNavigation(){
//        this.driverFactory = new DriverFactory();
//    }

    @Override
    public void navigateTo(String url) throws IOException {
        getDriver().get(
                PropertyManager.readProperty(url)
        );
    }

    @Override
    public void navigateBack() {
        getDriver().navigate().back();
    }

    @Override
    public void navigateForward() {
        getDriver().navigate().forward();
    }

    @Override
    public void refresh() {
        getDriver().navigate().refresh();
    }

    @Override
    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void quitDriver() {
        closeDriver();
    }
}
