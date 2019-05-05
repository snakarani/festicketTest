package FesticketBDD.PageObject;

import FesticketBDD.Utils;
import org.openqa.selenium.By;

public class LogInPage extends Utils {

    private By _enterEmailAddress = By.id("emailInput");
    private By _enterPassword = By.id("passwordInput");
    private By _clickOnLoginButton = By.xpath("//form[@class=\"LoginForm__c-sc-1blof28-0 esQgdu\"]/button");

    public void enterValidCredentials() {
        enterText(_enterEmailAddress, "sandipk.nakarani@gmail.com");
        enterText(_enterPassword, "p4ssword1");// this can be encrypted ,kept simple for given scenario

    }
        public void clickOnLoginButton() {
        waitUntilElementToBeClickable(_clickOnLoginButton, 20);
        clickOnElement(_clickOnLoginButton);
    }

}
