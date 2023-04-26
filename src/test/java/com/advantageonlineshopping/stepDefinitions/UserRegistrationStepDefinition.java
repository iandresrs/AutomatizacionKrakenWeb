package com.advantageonlineshopping.stepDefinitions;

import com.advantageonlineshopping.steps.UserRegistrationStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserRegistrationStepDefinition {

    @Steps
    UserRegistrationStep userRegistrationStep;

    @Given("^the user is on the website$")
    public void theUserIsOnTheWebsite() {
        userRegistrationStep.openBrowser();
    }

    @When("^the user clicks on create new account button$")
    public void theUserClicksOnCreateNewAccountButton() {
        userRegistrationStep.clickNewUser();
    }

    @And("^the user fills in the form with his data$")
    public void theUserFillsInTheFormWithHisData() {
        userRegistrationStep.writeUserData();
    }

    @Then("^the user will be able to validate his user name$")
    public void theUserWillBeAbleToValidateHisUserName() {
        userRegistrationStep.validateUser();
    }
}
