package Framework.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

public class PageConnector {
    private static WebElement webElement;
    private static List<WebElement> webElements;
    private static Class webPage;
    private static Field field;
    private static List<Field> fields;
    private DriverFactory driverFactory = new DriverFactory();
    private WebDriver driver;

    public void initializePage(String pageName) throws ClassNotFoundException {
        //We need a package name/path where our webpages are stored
        String PackageName = "Framework.Pages";
        String fullPath = PackageName + "." + pageName;
        if(pageName != null){
        webPage = Class.forName(fullPath);
        PageFactory.initElements(driverFactory.getDriver(),webPage);
        }else{
            throw new IllegalArgumentException("page cant be null");
        }
    }

    public WebElement getWebElement(String element) throws NoSuchFieldException, IllegalAccessException {
        field = webPage.getDeclaredField(element);
        webElement = (WebElement )field.get(element);
        return webElement;
    }

    public List<WebElement> getWebElements(String element) throws NoSuchFieldException, IllegalAccessException {
        field = webPage.getDeclaredField(element);
        webElements = (List<WebElement> )field.get(element);
        return webElements;
    }
}
