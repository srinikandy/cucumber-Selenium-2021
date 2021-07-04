package Framework.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue= {"Framework.Steps"},
        features="classpath:features",
        plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber-json-report.json"},
        monochrome=true,
        dryRun=false
        //tags = "@Scenario1"
        )
public class TestRunner {

}
