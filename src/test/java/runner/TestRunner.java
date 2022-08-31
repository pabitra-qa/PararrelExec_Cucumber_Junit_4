package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "stepDef", "hooks" },
        tags = "not @Skip_Scenario",
        plugin = {"pretty",
                "html:testReports/CucumberReports/Cucumber.html"
        }, monochrome = true)

public class TestRunner
{

}
