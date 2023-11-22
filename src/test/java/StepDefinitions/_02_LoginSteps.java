package StepDefinitions;

import Pages.ButtonContent;
import Pages.TextContent;
import Utilities.ParameterDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _02_LoginSteps {
    ButtonContent bc = new ButtonContent();
    TextContent tc = new TextContent();

    @And("Enter {string} as username and {string} as password")
    public void enterAsUsernameAndAsPassword(String userName, String passWord) throws InterruptedException {
        Thread.sleep(2000);
        tc.sendKeysMethod(tc.loginUserName, userName);
        Thread.sleep(2000);
        tc.sendKeysMethod(tc.loginPassword, passWord);

    }

    @And("Click on Log in button")
    public void clickOnLogInButton() throws InterruptedException {
        Thread.sleep(2000);
        bc.clickMethod(bc.loginButton);;


    }

    @Then("Assert all attempts")
    public void assertAllAttempts() throws InterruptedException {
        Thread.sleep(2000);
        bc.assertTitle();

    }
}
