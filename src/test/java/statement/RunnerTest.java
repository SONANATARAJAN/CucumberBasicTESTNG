package statement;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"statement"},
        plugin = {"pretty",
        "html:target/cucuTestNg.html",
        "json:target/cucuTestng.json"},
        monochrome = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
