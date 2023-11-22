package Pages;

import Utilities.ParameterDriver;
import Utilities.customMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextContent extends customMethods {
    public TextContent() {
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }
    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement addressLine;

    @FindBy(id = "customer.address.city")
    public WebElement cityLine;

    @FindBy(id = "customer.address.state")
    public WebElement stateLine;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCodeLine;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneLine;

    @FindBy(id = "customer.ssn")
    public WebElement ssnLine;

    @FindBy(id = "customer.username")
    public WebElement userName;
    @FindBy(id = "customer.password")
    public WebElement password;
    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;
    @FindBy(xpath= "(//div//p[text()])[3]")
    public WebElement successMessage1;

    @FindBy(xpath= "//input[@name='username']")
    public WebElement loginUserName;
    @FindBy(xpath= "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement payeeAdress;

    @FindBy(name = "payee.address.city")
    public WebElement payeeCity;

    @FindBy(name = "payee.address.state")
    public WebElement payeeState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement payeezipCode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement payeePhoneNumber;

    @FindBy(name = "payee.accountNumber")
    public WebElement payeeAccountNumber;
    @FindBy(name = "verifyAccount")
    public WebElement payeeVerifyAccountNumber;

    @FindBy(name = "amount")
    public WebElement payeeAmount;

}
