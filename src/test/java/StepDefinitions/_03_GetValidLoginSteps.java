package StepDefinitions;

import Pages.TextContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _03_GetValidLoginSteps {
    TextContent tc = new TextContent();

    @And("Enter valid {string} as username and valid {string} as password")
    public void enterValidAsUsernameAndValidAsPassword(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        tc.sendKeysMethod(tc.loginUserName, username);
        Thread.sleep(2000);
        tc.sendKeysMethod(tc.loginPassword, password);
    }

    @Then("Assert you successfully login with valid credentials")
    public void assertYouSuccessfullyLoginWithValidCredentials() throws InterruptedException {
        Thread.sleep(2000);
        tc.assertLogin();
    }
}
