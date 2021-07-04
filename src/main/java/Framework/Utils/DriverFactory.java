package Framework.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;

public class DriverFactory {
    public static WebDriver driver;
    // -Dbrowser = "chrome"
    private String browser = System.getProperty("browser");
    private final String chromePath = System.getProperty("user.dir") +
            File.separator + "Drivers" + File.separator + "chromedriver.exe";
    private final String firefoxPath = System.getProperty("user.dir") +
            File.separator + "Drivers" + File.separator + "geckodriver.exe";
    private final String edgePath = System.getProperty("user.dir") +
            File.separator + "Drivers" + File.separator + "msedgedriver.exe";
    private DesiredCapabilities capabilities;

    //singleton
    public WebDriver getDriver(){
        //if it is null then return new instance of driver
        if(this.driver == null){
            driverSetup();
            System.out.println("Inside of getDriver method");
        }
        System.out.println("Driver value is  "+ this.driver);
        return this.driver;
    }

    protected void driverSetup(){
        if(this.browser == null)
            browser = "chrome";
        if(browser.equalsIgnoreCase("chrome")){
            initiateChromeDriver();
        }else if(this.browser.equalsIgnoreCase("firefox")){
            initiateFirefoxDriver();
        }else if  (this.browser.equalsIgnoreCase("edge")){
            initiateEdgeDriver();
        }else if (this.browser.equalsIgnoreCase("safari"))
            initiateSafariDriver();
        else{
            throw new IllegalArgumentException("Please pass valid browser");
        }
    }

    public void closeDriver(){
        getDriver().quit();
    }

    private void initiateSafariDriver() {
        this.driver = new SafariDriver();
    }

    private void initiateEdgeDriver() {
        System.setProperty("webdriver.edge.driver", edgePath );
        this.driver = new EdgeDriver();
    }

    private void initiateFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", firefoxPath );
        this.capabilities = DesiredCapabilities.firefox();
        this.capabilities.setCapability("marionette",true);
        this.driver = new FirefoxDriver(capabilities);
    }

    private void initiateChromeDriver() {
        System.out.println("chrome path" + chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath );
        this.driver = new ChromeDriver();
    }

}
