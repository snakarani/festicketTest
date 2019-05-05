package FesticketBDD.PageObject;

import FesticketBDD.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _clickOnLoginButton= By.xpath("//span[contains(text(),'Log In')]");
    private By _clickOnLogOut = By.linkText("Log Out");

    public void clickOnLoginButton(){
        clickOnElement(_clickOnLoginButton);

    }
    public void clickOnLogOut(){
        waitUntilElementToBeClickable(_clickOnLogOut,20);
        clickOnElement(_clickOnLogOut);
    }
}
