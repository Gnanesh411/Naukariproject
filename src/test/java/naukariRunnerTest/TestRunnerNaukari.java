package naukariRunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "\\Users\\gnane\\eclipse-workspace\\NaukariProject\\src\\test\\resources\\features\\NaukariLogin.feature",glue = {"naukariStepDefs","hooks"}
,plugin = {"pretty","html:target/cucumber.html"})
public class TestRunnerNaukari extends AbstractTestNGCucumberTests {

}
