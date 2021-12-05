import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
        features = {"features"},
        glue = {"stepdefinitions"} ,
        plugin =  {"json:report/json/cucumber.json"}
    )

    public class TestRunner{

}
