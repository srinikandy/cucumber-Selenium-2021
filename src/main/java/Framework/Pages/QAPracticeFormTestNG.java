package Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAPracticeFormTestNG {

    private WebDriver driver;
    private WebDriverWait wait;

    //driver instance provided by some other class
    public QAPracticeFormTestNG(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "userName")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    //navigate to the page
    public void navigateTo(){
        this.driver.get("xyz.com");
        this.wait.until(ExpectedConditions.visibilityOf(firstName));
    }
    //enter first name and password
    public void enterPersonalDetails(String firstName,String lastName){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
    }

    public void enterCredentials(String userName,String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
    }

}
