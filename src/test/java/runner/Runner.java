package runner;



//@RunWith(Cucumber.class)
//@CucumberOptions(

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features"},
        glue = {"stepDefinitions"},
        //strict = true, // strict exception posted on console
        //tags = {"@Employee or @Customer"},
        tags = {"@Sanity005"},
        monochrome = false,
        dryRun = false,
        plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json"}
)
public class Runner {
}
