package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber"},//"json:target/report.json"},//reports(html ,json)
        features = "src/test/resources/features",

        glue = "steps",
        tags = "@mira",
        dryRun = false




)
public class Runner {
}
