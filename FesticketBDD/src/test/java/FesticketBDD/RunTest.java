package FesticketBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@LogIn,@LogOut")
public class RunTest {

}
