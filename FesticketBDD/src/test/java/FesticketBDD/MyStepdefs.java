package FesticketBDD;

import FesticketBDD.PageObject.HomePage;
import FesticketBDD.PageObject.LogInPage;
import FesticketBDD.PageObject.VerifyDetails;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    VerifyDetails verifyDetails = new VerifyDetails();


    @Given("^I am on HomePage of festicket\\.com$")
    public void iAmOnHomePageOfFesticketCom() {
    }

    @When("^I click on LogIn button$")
    public void iClickOnLogInButton() {
        homePage.clickOnLoginButton();

    }

    @And("^Enter valid Email address and Passeword$")
    public void enterValidEmailAddressAndPasseword() {
        logInPage.enterValidCredentials();
    }

    @And("^click on LogIn$")
    public void clickOnLogIn() {
        logInPage.clickOnLoginButton();
    }

    @Then("^I should be able to LogIn successfully and User details should display on UserProfile menu$")
    public void iShouldBeAbleToLogInSuccessfullyAndUserDetailsShouldDisplayOnUserProfileMenu() {
        verifyDetails.verifyUserDetails();
    }

    @Given("^I have logged in successfully$")
    public void iHaveLoggedInSuccessfully() {
        homePage.clickOnLoginButton();
        logInPage.enterValidCredentials();
        logInPage.clickOnLoginButton();


    }

    @When("^I click on user profile button$")
    public void iClickOnUserProfileButton() {
        verifyDetails.clickOnUserButton();
    }

    @And("^click on Log Out button$")

    public void clickOnLogOutButton() {
        homePage.clickOnLogOut();

    }

    @Then("^I should Log out successfully and nevigate to homepage$")
    public void iShouldLogOutSuccessfullyAndNevigateToHomepage() {
        verifyDetails.verifyLogOut();
    }
}
