package statement;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "statement",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json"
        },
        monochrome = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
