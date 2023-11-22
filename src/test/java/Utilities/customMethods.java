package Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class customMethods {
    public WebDriverWait wait = new WebDriverWait(ParameterDriver.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) ParameterDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element) {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text) {
        waitUntilClickable(element);
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void assertText(WebElement element, String text) {
        waitUntilClickable(element);
        Assert.assertTrue(element.getText().contains(text));
    }

    public void assertTitle() {

        if (ParameterDriver.getDriver().getTitle().contains("Welcome")) {
        } else if (ParameterDriver.getDriver().getTitle().contains("Error")) {
            Assert.assertTrue(ParameterDriver.getDriver().getTitle().contains("Error"), "ERROR");
        } else if (ParameterDriver.getDriver().getTitle().contains("Accounts Overview")) {
            Assert.assertTrue(ParameterDriver.getDriver().getTitle().contains("Accounts Overview"), "SUCCESS");
        } else {
            System.out.println("Wrong Command!");
        }
    }

    public void assertLogin() {
        Assert.assertTrue(ParameterDriver.getDriver().getTitle().contains("Accounts Overview"));
    }


}
