import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags={"@menu"}, dryRun = false,
plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/tsr.html")

public class Run
{

}
