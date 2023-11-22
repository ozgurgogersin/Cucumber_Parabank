package ParallelStepDefinitions;

import Utilities.ParameterDriver;
import io.cucumber.java.en.Given;

public class Login {
    @Given("Navigate to ParaBank Website with {string}")
    public void navigateToParaBankWebsiteWith(String browser) {
        ParameterDriver.setThreadDriverName(browser);
        ParameterDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }


}
