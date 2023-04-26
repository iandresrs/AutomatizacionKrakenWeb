package com.advantageonlineshopping.stepDefinitions;

import com.advantageonlineshopping.steps.BuyStep;
import com.advantageonlineshopping.steps.LoginStep;
import com.advantageonlineshopping.steps.UserRegistrationStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuyStepDefinition {
    @Steps
    LoginStep loginStep;

    @Steps
    BuyStep buyStep;

    @Steps
    UserRegistrationStep openBrowser;

    @Given("^That the user is on the page$")
    public void thatTheUserIsOnThePage() {
        openBrowser.openBrowser();
    }

    @When("^The user logs in$")
    public void theUserLogsIn() {
        loginStep.enterCredentials();
    }

    @When("^The user makes the purchase$")
    public void theUserMakesThePurchase() {
        buyStep.purchaseFlow();
    }

    @Then("^The user can validate that the purchase has been successful\\.$")
    public void theUserCanValidateThatThePurchaseHasBeenSuccessful() {
        buyStep.validation();
    }

}
