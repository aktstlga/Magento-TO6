package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featureFiles/_02_Login.feature"},
        glue = {"stepDefinitions"}
)
public class RunnerAll extends AbstractTestNGCucumberTests {
}
