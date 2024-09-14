package loopcamp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/json-reports/cucumber.json",
                "html:target/html-reports/cucumber-report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",},
        features = "src/test/resources/features",
        publish = true,
        tags = "@regression or @smoke"
)
public class CukesRunner {}