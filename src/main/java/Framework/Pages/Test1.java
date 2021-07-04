package Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        // set chrome driver property
        WebDriver driver = new ChromeDriver();
        QAPracticeFormTestNG qa = new QAPracticeFormTestNG(driver);

        //steps
        qa.navigateTo();
        qa.enterPersonalDetails("Srinivasa","Kandula");

        //test2
        qa.navigateTo();
        qa.enterCredentials("user1","password1");

    }
}
