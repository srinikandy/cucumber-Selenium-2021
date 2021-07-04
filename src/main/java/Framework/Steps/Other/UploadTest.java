package Framework.Steps.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class UploadTest {
    public static void main(String[] args) throws InterruptedException {
        String FilePath = System.getProperty("user.dir")+ File.separator+ "upload.txt";
        System.setProperty(
                "webdriver.gecko.driver",
                System.getProperty("user.dir") + File.separator
                        + "Drivers" + File.separator + "geckodriver.exe"
        );
        WebDriver driver = new FirefoxDriver();
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
        Thread.sleep(5000);
        driver.findElement(By.name("upfile")).sendKeys(FilePath);
        Thread.sleep(5000);
    }
}
