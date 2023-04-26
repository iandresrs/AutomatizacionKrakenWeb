package com.advantageonlineshopping.stepDefinitions;

import com.advantageonlineshopping.steps.LoginStep;
import com.advantageonlineshopping.steps.UserRegistrationStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    LoginStep loginStep;

    @Steps
    UserRegistrationStep userRegistrationStep;

    @When("^user enter your credentials$")
    public void userEnterYourCredentials() {
        loginStep.enterCredentials();
    }

    @Then("^validate user$")
    public void validateUser() {
        userRegistrationStep.validateUser();
    }

}
