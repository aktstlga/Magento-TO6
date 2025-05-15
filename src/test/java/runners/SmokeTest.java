package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionT",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"}
)
public class SmokeTest extends AbstractTestNGCucumberTests {

}
