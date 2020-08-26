package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_defs",
        dryRun = false,
        tags = "",
        plugin = {
                "json:target/cucumber-reports/CucumberTestReport.json"
        }
)
public class runTest {
}
