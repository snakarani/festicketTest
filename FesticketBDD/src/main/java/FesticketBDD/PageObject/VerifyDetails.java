package FesticketBDD.PageObject;

import FesticketBDD.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyDetails extends Utils {
    private By _clickOnUserButton = By.xpath("//ul/li[6]/div/div/div[1]/span");
    private By _userprofilename = By.xpath("//a/div/h3[@class=\"sc-VigVT iVnnoe\"]");

    public void clickOnUserButton() {
        //applied explicity wait
        waitUntilElementToBeClickable(_clickOnUserButton, 20);
        clickOnElement(_clickOnUserButton);
    }

    //Assert login with profile name
    public void verifyUserDetails() {
        clickOnUserButton();
        assertByGetText("Test User", _userprofilename, "Invalid User Name");
    }

    //verigy log out with url after log out
    public void verifyLogOut() {
        Assert.assertEquals("https://www.festicket.com/", driver.getCurrentUrl(), "User is not logged out");


    }
}
