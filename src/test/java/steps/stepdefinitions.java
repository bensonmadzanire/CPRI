package steps;

import base.FrameworkConfig;
import com.microsoft.playwright.Frame;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CommonFunctions;
import pages.GridFunctions;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://qa-cpri2/");

    }

        @And("I click login button")
    public void iClickLoginButton() {

     loginPage.clickLoginButton();
    }

    @And("I enter the username as  {string}")
    public void iEnterTheUsernameAs(String userName) {

        loginPage.captureUsernameField(userName);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {

        loginPage.capturePasswordField(password);
    }




    @And("I click Tranche Name")
    public void iClickTrancheName() throws InterruptedException {
        Thread.sleep(3000);
     homePage.clickTrancheName();
    }

    @And("I click the date and time")
    public void iClickTheDateAndTime() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickTheDateandTime();
    
    }

    @And("I click SSOEnabled checkbox")
    public void iClickSSOEnabledCheckbox() {
     homePage.clickSSOEnabledChecknox();
    }

    @And("I click new deal button")
    public void iClickNewDealButton() {
    homePage.clickNewDealButton();

    }
    @And("I enter the dealname as {string}")
    public void iEnterTheDealnameAs(String dealName){
        homePage.captureDealName(dealName);
    }

    @And("I select the CPRI Team")
    public void iSelectTheCPRITeam() {
        CommonFunctions.selectDropDownElementForCPRI("CpriTeam","option-586");
    }

    @And("I select the CPRIPrincipal")
    public void iSelectTheCPRIPrincipal() {
        homePage.selectCPRIPrincipal();
        CommonFunctions.selectDropDownElementForCPRI("CpriPrincipal", "option-586");
    }

    @And("I click save button")
    public void iClickSaveButton() {

    }

    @And("I click the option {string}")
    public void iClickTheOption() {
        homePage.clickOptionOnDropdown();
    }

    @And("I click the discard button")
    public void iClickTheDiscardButton() {
        homePage.clickDiscardButton();
    }
}
