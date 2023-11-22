package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
    features = "src/test/java/FeatureFiles/_02_Login.feature",
            glue = "StepDefinitions",
            plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json" }
)
public class _04_LoginJenkins extends AbstractTestNGCucumberTests {


}
