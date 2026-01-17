package statement;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "statement",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @Test
    public void runCucumber() {
        // DO NOT REMOVE – THIS TRIGGERS TESTNG
    }
}
