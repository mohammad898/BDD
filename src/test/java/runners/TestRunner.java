package runners;
 
import org.junit.runner.RunWith;
 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/functionalTests/login",
 glue= {"stepDefinitions/LoginStepDefinition"}
 )
 
public class TestRunner {
 
}