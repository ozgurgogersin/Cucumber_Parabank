package StepDefinitions;

import Pages.ButtonContent;
import Pages.TextContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class _04_PayBillSteps {

    ButtonContent bc = new ButtonContent();
    TextContent tc = new TextContent();

    @Given("Click on Bill Pay Link")
    public void clickOnBillPayLink() {

        bc.clickMethod(bc.billPayButton);
    }

    private static int index = 0;
    @And("Fill static information")
    public void fillStaticInformation(DataTable dataTable) {

        List<List<String>> staticList = dataTable.asLists(String.class);

        tc.sendKeysMethod(tc.payeeAdress, staticList.get(0).get(index));
        tc.sendKeysMethod(tc.payeeCity, staticList.get(1).get(index));
        tc.sendKeysMethod(tc.payeeState, staticList.get(2).get(index));
        tc.sendKeysMethod(tc.payeezipCode, staticList.get(3).get(index));
        tc.sendKeysMethod(tc.payeePhoneNumber, staticList.get(4).get(index));
        tc.sendKeysMethod(tc.payeeAccountNumber, staticList.get(5).get(index));
        tc.sendKeysMethod(tc.payeeVerifyAccountNumber, staticList.get(6).get(index));

        index++;
    }


    @And("Enter {string} and  and {string}")
    public void enterAndAnd(String payeeName, String amount)  {

        tc.sendKeysMethod(tc.payeeName, payeeName);
        tc.sendKeysMethod(tc.payeeAmount, amount);
    }

    @Then("Click on send payment button")
    public void clickOnSendPaymentButton() {
        bc.clickMethod(bc.sendPaymentButton);
    }

}
