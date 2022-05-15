package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true,
        tags = "@SmokeTesting"
)

public class RunTest extends AbstractTestNGCucumberTests {}
