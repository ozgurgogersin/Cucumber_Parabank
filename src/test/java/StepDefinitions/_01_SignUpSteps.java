package StepDefinitions;

import Pages.ButtonContent;
import Pages.TextContent;
import Utilities.ParameterDriver;
import Utilities.customMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_SignUpSteps {

    TextContent tc = new TextContent();
    ButtonContent bc = new ButtonContent();

    @Given("Navigate to ParaBank Website")
    public void navigateToParaBankWebsite() {
        ParameterDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click on Register button")
    public void clickOnRegisterButton() {
        bc.clickMethod(bc.register1Button);

    }

    @And("Enter {string}as firstName and {string} as lastName and {string} as adress {string} as city {string} as state {string} as zipCode {string} as PhoneNumber {string} as ssn {string} as username {string} as password {string} as confirmpassword")
    public void enterAsFirstNameAndAsLastNameAndAsAdressAsCityAsStateAsZipCodeAsPhoneNumberAsSsnAsUsernameAsPasswordAsConfirmpassword(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {
        tc.sendKeysMethod(tc.firstName, arg0);
        tc.sendKeysMethod(tc.lastName, arg1);
        tc.sendKeysMethod(tc.addressLine, arg2);
        tc.sendKeysMethod(tc.cityLine, arg3);
        tc.sendKeysMethod(tc.stateLine, arg4);
        tc.sendKeysMethod(tc.zipCodeLine, arg5);
        tc.sendKeysMethod(tc.phoneLine, arg6);
        tc.sendKeysMethod(tc.ssnLine, arg7);
        tc.sendKeysMethod(tc.userName, arg8);
        tc.sendKeysMethod(tc.password, arg9);
        tc.sendKeysMethod(tc.confirmPassword, arg10);

    }

    @And("Click Register Button")
    public void clickRegisterButton() {
        bc.clickMethod(bc.register2Button);
    }

    @Then("Assert you successfully login")
    public void assertYouSuccessfullyLogin() {
        tc.assertText(tc.successMessage1, "created");
    }



}
