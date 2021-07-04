package Framework.Steps.Validation;

import Framework.Utils.PageConnector;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidationSteps {

    private PageConnector connector = new PageConnector();

    @And("user verify {string} displayed")
    public void userVerifyDisplayed(String elements) throws Exception {

        boolean result = connector.getWebElements(elements).size() > 3 ? true:false;
        System.out.println("result is:" + result);
        System.out.println("size "+ connector.getWebElements(elements).size());
        if(!result)
            throw new Exception("Result failed");
    }

    @And("user verify field is displayed")
    public void userVerifyFieldIsDisplayed(DataTable table) throws NoSuchFieldException, IllegalAccessException {
        var tableData = table.asMaps();

//        {key:value}
//
//        {header:firstRow}
//        {WeBelement:search}
//
//        {header:secondRow}
//        {webElement:firstName}

       for(var dataRows : tableData){
           String element = dataRows.get("WebElement");
//           element.substring(0,1).equalsIgnoreCase("$"){
//           }
           connector.getWebElement(element).isDisplayed();
       }

    }
}
