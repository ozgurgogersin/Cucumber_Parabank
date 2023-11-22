package Pages;
import Utilities.ParameterDriver;
import Utilities.customMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class ButtonContent extends customMethods {

    public ButtonContent() {
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Register']")
    public  WebElement register1Button;
    @FindBy(xpath = "//input[@value='Register']")
    public WebElement register2Button;
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;
    @FindBy(linkText = "Log Out")
    public WebElement logoutButton;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentButton;

}
